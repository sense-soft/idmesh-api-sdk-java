

# CreateAppReq


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**type** | **String** | 1，自建应用，2模板应用（市场应用） |  |
|**domainSn** | **String** | 域名 |  |
|**templateId** | **String** | 不填写则代表自建应用 |  [optional] |
|**category** | **String** | 1 标准web应用，2单页web应用，3客户端应用，4后端服务 |  |
|**descr** | **String** |  |  [optional] |
|**logo** | **String** | 格式为：http://ip:port/logo.png |  [optional] |
|**loginUrl** | **String** |  |  [optional] |
|**redirectUrl** | **String** |  |  [optional] |
|**logoutUrl** | **String** |  |  [optional] |
|**subAccountPolicy** | **String** | 1启用，0不启用，启用后单点登录返回 |  [optional] |
|**sysExtProps** | **Object** | kv字典数据 |  [optional] |
|**freeExtProps** | **Object** | kv字典数据 |  |
|**protocolType** | **String** | 默认 oidc |  [optional] |
|**protocolProp** | [**CreateAppReqProtocolProp**](CreateAppReqProtocolProp.md) |  |  [optional] |
|**configProp** | [**CreateAppReqConfigProp**](CreateAppReqConfigProp.md) |  |  [optional] |
|**templateParams** | [**CreateAppReqTemplateParams**](CreateAppReqTemplateParams.md) |  |  [optional] |



