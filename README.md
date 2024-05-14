## RedisTemplate
自定义的 `RedisTemplate` 配置类相对于 Spring 提供的默认配置有以下几个优点：

1. **自定义序列化方式**：默认的 `RedisTemplate` 使用的是 JdkSerializationRedisSerializer，这种序列化方式生成的结果不易阅读，且占用空间大。在这个自定义配置中，使用了 `Jackson2JsonRedisSerializer` 和 `StringRedisSerializer`，这样存储在 Redis 中的数据更易于阅读和理解。


2. **更好的集成**：自定义的 `RedisTemplate` 可以更好地集成到项目中，比如在这个配置中，使用了 `ObjectMapper` 来配置 `Jackson2JsonRedisSerializer`，这样可以更好地控制 JSON 的序列化和反序列化。

## RedisUtil

详细用法参考自：https://github.com/iyayu/RedisUtil
