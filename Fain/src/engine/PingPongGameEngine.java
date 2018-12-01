package engine;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import screens.*;
/**
 *Этот класс – обработчик событий мыши и клавиатуры.
 * Рассчитывает движение мяча и ракеток,изменение их координат.
 */
public class PingPongGameEngine implements Runnable, MouseMotionListener, KeyListener, GameConstants{
    private PingPongGreenTable table; // ссылка на стол
    private int kidRacket_Y = KID_RACKET_Y_START;
    private int computerRacket_Y=COMPUTER_RACKET_Y_START;
    private int kidScore;
    private int computerScore;
    private int ballX; // координата X мяча
    private int ballY; // координата Y мяча
    private boolean movingLeft = true;
    private boolean ballServed = false;//Значение вертикального передвижения мяча в пикселях
    private int verticalSlide;
    // Конструктор. Содержит ссылку на объект стола
    public PingPongGameEngine(PingPongGreenTable greenTable){
        table = greenTable;
        Thread worker = new Thread(this);
        worker.start();
    }
    // Обязательные методы из интерфейса MouseMotionListener
// (некоторые из них пустые,но должны быть включены все равно)
    public void mouseDragged(MouseEvent e) {
    }
    public void mouseMoved(MouseEvent e) {
        int mouse_Y = e.getY();
// Если мышь находится выше ракетки ребенка
// и не выходит за пределы стола – передвинуть ее вверх,
// в противном случае – опустить вниз
        if (mouse_Y<kidRacket_Y && kidRacket_Y>TABLE_TOP){
            kidRacket_Y -= RACKET_INCREMENT;
        }else if (kidRacket_Y < TABLE_BOTTOM) {
            kidRacket_Y += RACKET_INCREMENT;
        }
// Установить новое положение ракетки
        table.setKidRacket_Y(kidRacket_Y);
    }
    // Обязательные методы из интерфейса KeyListener
    public void keyPressed(KeyEvent e){
        char key = e.getKeyChar();
        if ('n' == key || 'N' == key){
            startNewGame();
        } else if ('q' == key || 'Q' == key){
            endGame();
        } else if ('s' == key || 'S' == key){
            kidServe();
        }}
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    // Начать новую игру
    public void startNewGame(){
        computerScore=0;
        kidScore=0;
        table.setMessageText("Score Computer: 0 Kid: 0");
        kidServe();
    }
    // Завершить игру
    public void endGame(){
        System.exit(0);
    }
    // Обязательный метод run() из интерфейса Runnable
    public void run(){
        boolean canBounce=false;
        while (true) {
            if(ballServed){ // если мяч движется
//Шаг 1. Мяч движется влево?
                if ( movingLeft && ballX > BALL_MIN_X){
                    canBounce = (ballY >= computerRacket_Y && ballY < (computerRacket_Y + RACKET_LENGTH)?true: false);
                    ballX-=BALL_INCREMENT;
// Добавить смещение вверх или вниз к любым
// движениям мяча влево или вправо
                    ballY-=verticalSlide;
                    table.setBallPosition(ballX,ballY);
// Может отскочить?
                    if (ballX <= COMPUTER_RACKET_X && canBounce){
                        movingLeft=false;
                    }
                }
// Шаг 2. Мяч движется вправо?
                if ( !movingLeft && ballX <= BALL_MAX_X){
                    canBounce = (ballY >= kidRacket_Y && ballY <(kidRacket_Y + RACKET_LENGTH)?true:false);
                    ballX+=BALL_INCREMENT;
                    table.setBallPosition(ballX,ballY);
// Может отскочить?
                    if (ballX >= KID_RACKET_X && canBounce){
                        movingLeft=true;
                    }
                }
// Шаг 3. Перемещать ракетку компьютера вверх или вниз,
// чтобы блокировать мяч
                if (computerRacket_Y < ballY
                        && computerRacket_Y < TABLE_BOTTOM){
                    computerRacket_Y +=RACKET_INCREMENT;
                }else if (computerRacket_Y > TABLE_TOP){
                    computerRacket_Y -=RACKET_INCREMENT;
                }
                table.setComputerRacket_Y(computerRacket_Y);
// Шаг 4. Приостановить
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
// Шаг 5. Обновить счет, если мячв зеленой области, но не движется
                if (isBallOnTheTable()){
                    if (ballX > BALL_MAX_X ){
                        computerScore++;
                        displayScore();
                    }else if (ballX < BALL_MIN_X){
                        kidScore++;
                        displayScore();
                    }
                }
            } // Конец if ballServed
        } // Конец while
    }// Конец run()// Подать с текущей позиции ракетки ребенка
    private void kidServe(){
        ballServed = true;
        ballX = KID_RACKET_X-1;
        ballY=kidRacket_Y;
        if (ballY > TABLE_HEIGHT/2){
            verticalSlide=-1;
        }else{
            verticalSlide=1;
        }
        table.setBallPosition(ballX,ballY);
        table.setKidRacket_Y(kidRacket_Y);
    }
    private void displayScore(){
        ballServed = false;
        if (computerScore ==WINNING_SCORE){
            table.setMessageText("Computer won! " + computerScore +
                    ":" + kidScore);
        }else if (kidScore ==WINNING_SCORE){
            table.setMessageText("You won! "+ kidScore +
                    ":" + computerScore);
        }else{
            table.setMessageText("Computer: "+ computerScore +
                    " Kid: " + kidScore);
        }
    }
    // Проверить, не пересек ли мяч верхнюю или нижнюю границу стола
    private boolean isBallOnTheTable(){
        if (ballY >= BALL_MIN_Y && ballY <= BALL_MAX_Y){
            return true;
        }else {
            return false;
        }
    }
}