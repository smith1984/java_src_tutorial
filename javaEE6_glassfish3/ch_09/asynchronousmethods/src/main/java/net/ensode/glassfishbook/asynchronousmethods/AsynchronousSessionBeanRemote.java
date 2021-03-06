/*
 * Чтобы изменить этот шаблон, выберите Инструменты (Tools) | Шаблоны (Templates)
 * и откройте шаблон в редакторе.
 */

package net.ensode.glassfishbook.asynchronousmethods;

import java.util.concurrent.Future;
import javax.ejb.Remote;

/**
 *
 * @author David R. Heffelfinger <dheffelfinger@ensode.com>
 */
@Remote
public interface AsynchronousSessionBeanRemote {

  void slowMethod();

  Future<Long> slowMethodWithReturnValue();
    
}
