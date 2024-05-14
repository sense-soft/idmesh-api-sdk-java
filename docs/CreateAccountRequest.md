

# CreateAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** |  |  [optional] |
|**appId** | **String** |  |  |
|**accName** | **String** |  |  |
|**accNameDisplayed** | **String** |  |  [optional] |
|**accSource** | **String** |  |  [optional] |
|**accPassword** | **String** |  |  [optional] |
|**accStatus** | **String** | 0: 禁用，1: 启用，默认启用 |  [optional] |
|**accType** | **String** | personal: 个人账号 shared: 公共账号 默认 personal |  [optional] |
|**sysExtProps** | **Object** |  |  [optional] |
|**freeExtProps** | **Object** |  |  [optional] |
|**expireAt** | **String** | rfc3339格式，不传默认永久生效 |  [optional] |



