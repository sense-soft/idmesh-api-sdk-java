

# AppConfigRet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | 唯一标识 |  |
|**appId** | **String** | 应用ID |  |
|**allowedLoginMethod** | **String** | 允许的登录方式，格式为：[\&quot;password\&quot;, \&quot;vercode\&quot;] |  [optional] |
|**defaultLoginMethod** | **String** | 默认登录方式，格式为：password |  |
|**allowedRegMethod** | **String** | 允许注册方式，格式为：[\&quot;mobile\&quot;, \&quot;email\&quot;] |  [optional] |
|**defaultRegMethod** | **String** | 默认注册方式，格式为：mobile |  |
|**accessPolicy** | **String** | 应用级访问控制权限，格式为：{\&quot;password_recovery\&quot;: [\&quot;email\&quot;]} |  [optional] |
|**regPolicy** | **String** | 新用户注册策略（是否允许自动注册，注册验证方式等），1是，2否, |  [optional] |
|**allowedIdProvider** | **String** | 允许的登录身份提供商，格式为：{\&quot;wechat_scan_qr\&quot;: 1, \&quot;dingding_scan_qr\&quot;: 2} |  [optional] |
|**ssoEnabled** | **Boolean** | 是否允许SSO |  |
|**mfaEnabled** | **Boolean** | 是否开启MFA |  [optional] |
|**mfaConfig** | [**AppConfigRetMfaConfig**](AppConfigRetMfaConfig.md) |  |  [optional] |
|**timeCreated** | **String** | 创建时间 |  [optional] |
|**timeModified** | **String** | 修改时间 |  [optional] |
|**status** | **String** | 状态，1启用，0禁用 |  [optional] |



