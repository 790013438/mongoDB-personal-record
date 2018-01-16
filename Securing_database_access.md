```bash
use admin
```
创建User
```bash
db.createUser{
  {
    user: "administrator",
    pwd: "mypassword",
    roles: ["root"]
  }
}
```
关闭
```bash
db.shutdownServer()
```
启动
```bash
mongod --dbpath "C:\mongodb-win32-x86_64-3.0.3\data" --auth
```
登录
```bash
mongo -u administrator --authenticationDatabase admin -p
```
- 使用另一种方式验证
```bash
use admin
db.auth('admin', 'mypassword')
```
