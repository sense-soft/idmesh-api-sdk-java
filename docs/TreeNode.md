

# TreeNode


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | 节点ID |  [optional] |
|**arn** | **String** |  |  [optional] |
|**timeCreated** | **String** | 创建时间 |  [optional] |
|**tag** | **String** | 用于定义节点类型，目前支持：org（组织），role（角色），position（岗位），group（组） |  [optional] |
|**status** | **String** | 状态 |  [optional] |
|**isPointer** | **String** | 是否指针类型 |  [optional] |
|**code** | **String** | 节点code |  |
|**name** | **String** | 节点名字 |  |
|**permNamespaceArn** | **String** | 抽象权限容器的ARN |  [optional] |
|**condition** | **String** |  |  [optional] |
|**isDynamic** | **String** | 是否动态节点（0普通结点，1动态结点） |  [optional] |
|**sysCode** | **String** | 系统code |  |
|**operatorId** | **String** | 操作者id |  [optional] |
|**pointerId** | **String** | 指针指向的实体节点 |  [optional] |
|**seq** | **Integer** | 序号 |  [optional] |
|**description** | **String** | 描述 |  [optional] |
|**timeModified** | **String** | 最后修改时间 |  [optional] |
|**objectCode** | **String** | OBJ_ID，组织，角色，岗位，职级等 |  |
|**parentId** | **String** | 父节点id |  [optional] |
|**sysExtProps** | **Object** | 额外属性，需要先定义schema |  [optional] |
|**freeExtProps** | **Object** | 可以自由扩展 |  [optional] |



