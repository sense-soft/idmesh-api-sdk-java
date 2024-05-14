

# AppConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**appId** | **String** |  |  |
|**allowedLoginMethod** | **String** | 格式为：[\&quot;password\&quot;, \&quot;vercode\&quot;] |  [optional] |
|**defaultLoginMethod** | **String** | 格式为：password |  [optional] |
|**allowedRegMethod** | **String** | 格式为：[\&quot;mobile\&quot;, \&quot;email\&quot;] |  [optional] |
|**defaultRegMethod** | **String** | 格式为：mobile |  [optional] |
|**accessPolicy** | **String** | permitted,all |  [optional] |
|**regPolicy** | **String** |  |  [optional] |
|**allowedIdProvider** | [**AppConfigAllowedIdProvider**](AppConfigAllowedIdProvider.md) |  |  [optional] |
|**ssoEnabled** | **Boolean** |  |  |
|**mfaEnabled** | **Boolean** |  |  |
|**mfaConfig** | [**MFA**](MFA.md) |  |  [optional] |
|**accessControlEnabled** | **Boolean** |  |  |
|**timeCreated** | **String** |  |  |
|**timeModified** | **String** |  |  |
|**status** | **String** | 1启用，0禁用 |  |



