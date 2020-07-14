/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package play.runsupport

import java.net.InetSocketAddress

import play.core.server.{ReloadableServer, ServerWithStop}

class ServerWithStopReloadableServer(sss: ServerWithStop) extends ReloadableServer{

  override def stop(): Unit = sss.stop()

  override def reload(): Unit = ???

  override def mainAddress(): InetSocketAddress = sss.mainAddress()
}
