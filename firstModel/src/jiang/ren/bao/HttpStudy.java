package jiang.ren.bao;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * 姜宝
 * 2021/6/28
 */
public class HttpStudy {
    /**
     * 自定义http服务器
     */
    public static void main(String[] args) throws IOException {
        //申请端口号
        InetSocketAddress address = new InetSocketAddress(3303);
        //创建http服务器
        HttpServer httpServer = HttpServer.create(address, 0);
        //指定别名
        httpServer.createContext("/web", new HttpHandler() {
            @Override
            public void handle(HttpExchange httpExchange) throws IOException {
                System.out.println(httpExchange.getRequestMethod());
            }
        });
    }
}