
# 测试jenkins

安装jenkins环境
```
docker run --name jenkinsci -u root -d -p 8080:8080 -p 50000:50000 -v /home/blueocean/jenkins:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock jenkinsci/blueocean

```

直接通过容器日志可以看到密码：docker logs xxxx（容器 ID），推荐插件安装



附录：
1.如果在创建项目时候，没有“创建一个Maven 项目”的选项。
 点击“可选插件”  然后在右边的过滤输入框中输入搜索关键字： Maven Integration Plugin  或者 Pipeline Maven Integration Plugin ，搜索到了以后，点击直接安装，安装完成后重启就好了。


2.重启Jenkins
http://localhost:8080/restart

3.重载Jenkins配置信息
http://localhost:8080/reload

4.停止Jenkins服务器
http://localhost:8080/exit
