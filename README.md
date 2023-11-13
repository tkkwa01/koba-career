# Koba Career API（作成中）
学習用に作った簡易的な掲示板アプリのAPI

# Develop memo  
開発段階で詰まったところのメモ．
### Enviroment Setting
Spring Initializerで作るときにgradleのバージョンは2系を使う．Javaのバージョンは11を使う．   
IntelliJの設定で[File] → [Project Structure]でJDKのバージョンを11に指定する．

`build.gradle.kts`に以下を追加する．
```kotlin
tasks.bootBuildImage {
    builder = "paketobuildpacks/builder-jammy-base:latest"
}
```

Mybatis Generatorは以下を使用した．
```kotlin
id ("com.qqviaja.gradle.MybatisGenerator") version "2.5"
```

mysql-connector-javaのパスは``External Libraries``を探したらある．