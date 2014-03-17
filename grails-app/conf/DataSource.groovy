dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
    username = "root"
    password = "30lospinos"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop','update'
            url = "jdbc:mysql://localhost/sec_treasurer?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "30lospinos"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/sec_treasurer_prod?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "30lospinos"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/sec_treasurer_prod?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "30lospinos"
        }
    }
}
