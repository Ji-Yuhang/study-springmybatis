# study-springmybatis
## spring学习资料

[bilibili 编程不良人](https://space.bilibili.com/352224540/channel/detail?cid=123397)

[快速入门Spring,SpringBoot、SpringCloud学不好完全是因为Spring没有掌握!](https://www.bilibili.com/video/BV12k4y167jK)

[26. ssm整合之编程步骤](https://www.bilibili.com/video/BV12k4y167jK?p=26)

## 辅助脚本
run-mysql.sh
```
mkdir /home/jiyuhang/mysqldata
docker run --name mysql -p 3306:3306 -v /home/jiyuhang/mysqldata:/var/lib/mysql -e MYSQL\_ROOT\_PASSWORD=root -d mysql
ifconfig |grep 192.168 |awk '{print $2}'
```

查看本机ip 
```
ifconfig |grep 192.168 |awk '{print $2}'
```

run-adminer.sh
```
docker run --name adminer -p 8081:8080 -d --restart=always adminer
```