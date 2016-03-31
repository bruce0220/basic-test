package other.netty.discard;

import other.netty.discard.DiscardServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class DiscardServer {

	public static void main(String[] args) {

	}

	public void run() {
		try {
			EventLoopGroup boss = new NioEventLoopGroup();
			EventLoopGroup work = new NioEventLoopGroup();

			ServerBootstrap bs = new ServerBootstrap();
			bs.group(boss, work).channel(NioServerSocketChannel.class)
					.childHandler(new ChannelInitializer<Channel>() {
						@Override
						protected void initChannel(Channel ch) throws Exception {
							ch.pipeline().addLast(new DiscardServerHandler());
						};
					}).option(ChannelOption.SO_BACKLOG, 128)
					.childOption(ChannelOption.SO_KEEPALIVE, true);
			
			ChannelFuture future = bs.bind(81).sync();
			future.channel().closeFuture().sync();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
