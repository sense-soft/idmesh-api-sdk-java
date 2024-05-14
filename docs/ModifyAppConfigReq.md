

# ModifyAppConfigReq


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedLoginMethod** | **String** | 允许的登录方式，格式为：[\&quot;password\&quot;, \&quot;vercode\&quot;] |  [optional] |
|**defaultLoginMethod** | **String** | 默认登录方式，格式为：password |  [optional] |
|**allowedRegMethod** | **String** | 允许注册方式，格式为：[\&quot;mobile\&quot;, \&quot;email\&quot;] |  [optional] |
|**defaultRegMethod** | **String** | 默认注册方式，格式为：mobile |  [optional] |
|**defaultProtocol** | **String** | 默认登录协议 |  [optional] |
|**accessPolicy** | **String** | 应用级访问控制权限，all: 所有人可访问 permitted: 拒绝未授权访问 |  [optional] |
|**regPolicy** | **List&lt;String&gt;** | 新用户注册策略（是否允许自动注册，注册验证方式等），1是，2否, |  [optional] |



