

# CreateUserReq


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | 用户名，唯一，不传后台自动生成 |  [optional] |
|**password** | **String** | 密码，不传后台生成默认密码 |  [optional] |
|**passwordStatus** | **String** | 密码状态（valid/invalid） |  [optional] |
|**displayName** | **String** | 显示名称 |  [optional] |
|**firstname** | **String** | 名 |  [optional] |
|**lastname** | **String** | 姓 |  [optional] |
|**realname** | **String** | 真实姓名 |  [optional] |
|**pinyin** | **String** | 拼音 |  [optional] |
|**nickname** | **String** | 昵称 |  [optional] |
|**userType** | **String** | 用户类型，不传后台设置系统默认类型 |  [optional] |
|**mobile** | **String** | 手机 |  [optional] |
|**email** | **String** | 邮箱 |  [optional] |
|**gender** | **String** | 性别 |  [optional] |
|**certType** | **String** | 证件类型 |  [optional] |
|**certNumber** | **String** | 证件号 |  [optional] |
|**region** | **String** | 区域 |  [optional] |
|**workTime** | **String** | 加入时间 |  [optional] |
|**workTitle** | **String** | 职位 |  [optional] |
|**idpConfigId** | **Integer** | 身份源ID，作为创建时记录，不做更新 |  |
|**sysExtProps** | **Object** | 系统扩展属性，json对象{\&quot;age\&quot;: 18, \&quot;love\&quot;: \&quot;足球\&quot;} |  [optional] |
|**freeExtProps** | **Object** | 自由扩展属性，json对象 |  [optional] |
|**relationData** | **Object** | 关系映射（如组织和岗位信息） |  [optional] |
|**isNotify** | **Boolean** | 是否通知：默认不传false不通知，true通知 |  [optional] |



