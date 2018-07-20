package com.gogoatom;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;


/**
 * Created by Atom on 2018/7/4.
 */
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel e) throws Exception{
        System.out.println("----报告----");
        System.out.println("信息：有一客户端链接到本服务端");
        System.out.println("IP:"+e.localAddress().getHostName());
        System.out.println("Port:"+e.localAddress().getPort());
        System.out.println("Address:" + e.remoteAddress());
        System.out.println("----报告完毕,准备接受数据----");

    }
}
