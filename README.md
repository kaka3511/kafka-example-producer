# kafka-example-producer
kafka生产者测试

1、zookeeper最好使用linux服务器上面提供，windows的容易“强制远程关闭连接”；
2、生产者项目这边的spring boot依赖版本跟消费者项目不一致（一致会报错），有待进一步研究；
3、消费者服务消费建议使用手动提交偏移量；
4、更多配置参数暂未使用进去，未完待续。。。
