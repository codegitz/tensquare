## 十次方社交项目后台

## 项目使用技术
### springboot系列
sprignboot 2.0</br>
springdatajpa,security，cache</br>
### springcloud系列</br>
Eureka注册中心</br>
springcloudconfigserver配置中心</br>
springcloudbus动态刷新配置</br>
### 其他中间件
rabbitmq</br>
elasticSearch</br>

### 容器技术及相关
#### docker 
docker是如今很火的容器，具体可Google详情。</br>
#### Rancher
Rancher是一个开源的企业级全栈化容器部署及管理平台。Rancher为容器提供一揽子基础架构服务：CNI兼容的网络服务、存储服务、主机管理、负载均衡、防护墙……</br>
Rancher让上述服务跨越公有云、私有云、虚拟机、物理机环境运行，真正实现一键式应用部署和管理。</br>
#### influxDB
influxDB是一个分布式时间序列数据库。cAdvisor仅仅显示实时信息，但是不存储监视数据。因此，我们需要提供时序数据库用于存储cAdvisor组件所提供的监控信息，以便显示除实时信息之外的时序数据。</br>
#### cAdvisor
Google开源的用于监控基础设施应用的工具，它是一个强大的监控工具，不需要任何配置就可以通过运行在Docker主机上的容器来监控Docker容器，而且可以监控Docker主机。更多详细操作和配置选项可以查看Github上的cAdvisor项目文档。</br>
#### Grafana
Grafana是一个可视化面板（Dashboard），有着非常漂亮的图表和布局展示，功能齐全的度量仪表盘和图形编辑器。支持Graphite、zabbix、InfluxDB、Prometheus和OpenTSDB作为数据源。</br>
Grafana主要特性：灵活丰富的图形化选项；可以混合多种风格；支持白天和夜间模式；多个数据源。</br>
## 运行方式
导入IDEA，将配置文件中的数据库和中间件地址替换成自己的，然后逐个模块启动。</br>
需要替换的有:Mysql,Redis,mongoDB,rabbitmq,elaticsearch
## 目录结构
<details>
<summary>展开查看</summary>
<pre><code>.
├── tensquare_parent
│   ├── tensquare_article
|   |     |——ArticleApplication
│   ├── tensquare_base
|   |     |——baseApplication
│   ├── tensquare_common
|   |     |——
│   ├── tensquare_config
|   |     |——configApplication 
│   ├── tensquare_eureka
|   |     |——eurekaApplication
│   ├── tensquare_friend
|   |     |——friendApplication
│   ├── tensquare_gathering
|   |     |——gatheringApplication
│   ├── tensquare_manager
|   |     |——managerApplication
│   ├── tensquare_qa
|   |     |——qaApplication
│   ├── tensquare_recruit
|   |     |——recruitApplication
│   ├── tensquare_search
|   |     |——searchApplication
│   ├── tensquare_sms
|   |     |——smsApplication
│   ├── tensquare_spit
|   |     |——spitApplication
│   ├── tensquare_user
|   |     |——userApplication
│   ├── tensquare_web
|   |     |——webApplication
</code></pre>
</details>
