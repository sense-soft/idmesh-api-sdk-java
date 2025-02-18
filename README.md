# idmesh-api-sdk-java

IDMesh-Dev
- API version: 1.4.7

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.idmesh</groupId>
  <artifactId>idmesh-api-sdk-java</artifactId>
  <version>1.4.7</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'idmesh-api-sdk-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'idmesh-api-sdk-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.idmesh:idmesh-api-sdk-java:1.4.7"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/idmesh-api-sdk-java-1.4.7.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import cn.idmesh.ApiClient;
import cn.idmesh.ApiException;
import cn.idmesh.Configuration;
import com.idmesh.models.*;
import api.cn.idmesh.AppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    AppApi apiInstance = new AppApi(defaultClient);
    String name = "name_example"; // String | 应用名称
    String type = ""; // String | 应用类型
    String pageSort = "time_created[desc]"; // String | 排序，格式：字段名[顺序]
    String types = "1,2"; // String | 应用类型列表，逗号分隔
    try {
      AppWithPage result = apiInstance.callList()
            .name(name)
            .type(type)
            .pageSort(pageSort)
            .types(types)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#callList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppApi* | [**callList**](docs/AppApi.md#callList) | **GET** /v1/applications | 查询应用列表
*AppApi* | [**create**](docs/AppApi.md#create) | **POST** /v1/applications | 创建应用
*AppApi* | [**createAccount**](docs/AppApi.md#createAccount) | **POST** /v1/applications/{id}/accounts | 创建应用子账号
*AppApi* | [**createIDP**](docs/AppApi.md#createIDP) | **POST** /v1/applications/{id}/idp | 创建应用认证源
*AppApi* | [**createMFA**](docs/AppApi.md#createMFA) | **POST** /v1/applications/{id}/mfa | 启用应用多因素认证配置
*AppApi* | [**createSecrets**](docs/AppApi.md#createSecrets) | **POST** /v1/applications/{id}/secrets | 刷新应用安全码
*AppApi* | [**delete**](docs/AppApi.md#delete) | **DELETE** /v1/applications/{id} | 删除应用
*AppApi* | [**deleteAccount**](docs/AppApi.md#deleteAccount) | **DELETE** /v1/applications/{app_id}/accounts/{id} | 删除应用子账号
*AppApi* | [**deleteIDPConfig**](docs/AppApi.md#deleteIDPConfig) | **DELETE** /v1/applications/{app_id}/idp/{config_id} | 删除应用认证源
*AppApi* | [**deleteMFA**](docs/AppApi.md#deleteMFA) | **DELETE** /v1/applications/{app_id}/mfa/{config_id} | 禁用应用多因素认证配置
*AppApi* | [**disable**](docs/AppApi.md#disable) | **POST** /v1/applications/{id}/disable | 禁用应用
*AppApi* | [**disableAccount**](docs/AppApi.md#disableAccount) | **POST** /v1/applications/{app_id}/accounts/{id}/disable | 禁用应用子账号
*AppApi* | [**disableProtocol**](docs/AppApi.md#disableProtocol) | **POST** /v1/applications/{app_id}/protocols/{protocol_type}/disable | 禁用应用认证协议
*AppApi* | [**disableSSO**](docs/AppApi.md#disableSSO) | **POST** /v1/applications/{id}/sso/disable | 禁用应用单点登录
*AppApi* | [**enable**](docs/AppApi.md#enable) | **POST** /v1/applications/{id}/enable | 启用应用
*AppApi* | [**enableAccount**](docs/AppApi.md#enableAccount) | **POST** /v1/applications/{app_id}/accounts/{id}/enable | 启用应用子账号
*AppApi* | [**enableProtocol**](docs/AppApi.md#enableProtocol) | **POST** /v1/applications/{app_id}/protocols/{protocol_type}/enable | 启用应用认证协议
*AppApi* | [**enableSSO**](docs/AppApi.md#enableSSO) | **POST** /v1/applications/{id}/sso/enable | 启用应用单点登录
*AppApi* | [**get**](docs/AppApi.md#get) | **GET** /v1/applications/{id} | 按 ID 查询应用
*AppApi* | [**getAccount**](docs/AppApi.md#getAccount) | **GET** /v1/applications/{app_id}/accounts/{id} | 按 ID 查询应用子账号
*AppApi* | [**getAccounts**](docs/AppApi.md#getAccounts) | **GET** /v1/application-accounts | 按条件查询应用子账号列表
*AppApi* | [**getAccountsByApp**](docs/AppApi.md#getAccountsByApp) | **GET** /v1/applications/{app_id}/accounts | 按 APP ID 查询应用子账号列表
*AppApi* | [**getByDomain**](docs/AppApi.md#getByDomain) | **GET** /v1/application | 按条件查询应用
*AppApi* | [**getConfig**](docs/AppApi.md#getConfig) | **GET** /v1/applications/{id}/configs | 查询应用配置信息
*AppApi* | [**getProtocol**](docs/AppApi.md#getProtocol) | **GET** /v1/applications/{app_id}/protocols/{protocol_type} | 查询应用认证协议
*AppApi* | [**getProtocols**](docs/AppApi.md#getProtocols) | **GET** /v1/applications/{id}/protocols | 查询应用认证协议列表
*AppApi* | [**modify**](docs/AppApi.md#modify) | **PATCH** /v1/applications/{id} | 更新应用基本信息
*AppApi* | [**modifyAccount**](docs/AppApi.md#modifyAccount) | **PUT** /v1/applications/{app_id}/accounts/{id} | 更新应用子账号
*AppApi* | [**modifyConfig**](docs/AppApi.md#modifyConfig) | **PATCH** /v1/applications/{id}/configs | 更新应用配置
*AppApi* | [**modifyProtocol**](docs/AppApi.md#modifyProtocol) | **PUT** /v1/applications/{app_id}/protocols/{protocol_type} | 更新应用认证协议
*OrganizationApi* | [**createNode**](docs/OrganizationApi.md#createNode) | **POST** /v1/tree-nodes | 创建节点
*OrganizationApi* | [**createOrganization**](docs/OrganizationApi.md#createOrganization) | **POST** /v1/core-objects | 创建组织关系
*OrganizationApi* | [**deleteMembers**](docs/OrganizationApi.md#deleteMembers) | **DELETE** /v1/tree-users | 从节点移除用户
*OrganizationApi* | [**deleteNode**](docs/OrganizationApi.md#deleteNode) | **DELETE** /v1/tree-nodes/{id} | 删除节点
*OrganizationApi* | [**deleteOrganization**](docs/OrganizationApi.md#deleteOrganization) | **DELETE** /v1/core-objects/{id} | 删除组织关系
*OrganizationApi* | [**getChildrenNodes**](docs/OrganizationApi.md#getChildrenNodes) | **GET** /v1/tree-nodes/{id}/children | 获取子节点列表
*OrganizationApi* | [**getMembers**](docs/OrganizationApi.md#getMembers) | **GET** /v1/tree-users | 获取与用户关联的组织关系列表
*OrganizationApi* | [**getNode**](docs/OrganizationApi.md#getNode) | **GET** /v1/tree-nodes/{id} | 查询节点信息
*OrganizationApi* | [**getNodeMembers**](docs/OrganizationApi.md#getNodeMembers) | **GET** /v1/tree-nodes/{id}/tree-users | 获取成员信息列表
*OrganizationApi* | [**getNodeParent**](docs/OrganizationApi.md#getNodeParent) | **GET** /v1/tree-nodes/{id}/parent | 查询父节点
*OrganizationApi* | [**getNodes**](docs/OrganizationApi.md#getNodes) | **GET** /v1/tree-nodes | 查询节点信息列表
*OrganizationApi* | [**getOrganization**](docs/OrganizationApi.md#getOrganization) | **GET** /v1/core-objects/{id} | 获取组织关系基本信息
*OrganizationApi* | [**getOrganizations**](docs/OrganizationApi.md#getOrganizations) | **GET** /v1/core-objects | 获取组织关系列表
*OrganizationApi* | [**updateMember**](docs/OrganizationApi.md#updateMember) | **PATCH** /v1/tree-users/{id} | 更新用户节点
*OrganizationApi* | [**updateNode**](docs/OrganizationApi.md#updateNode) | **PATCH** /v1/tree-nodes/{id} | 编辑节点
*OrganizationApi* | [**updateOrganization**](docs/OrganizationApi.md#updateOrganization) | **PATCH** /v1/core-objects/{id} | 修改组织关系基本信息
*PermissionApi* | [**createAuthUnitRules**](docs/PermissionApi.md#createAuthUnitRules) | **POST** /v1/batch/auth-unit-rules | 批量创建授权规则
*PermissionApi* | [**createResource**](docs/PermissionApi.md#createResource) | **POST** /v1/resources | 创建资源
*PermissionApi* | [**createResourceSet**](docs/PermissionApi.md#createResourceSet) | **POST** /v1/resource-sets | 创建资源集合
*PermissionApi* | [**createResourceSetMember**](docs/PermissionApi.md#createResourceSetMember) | **POST** /v1/resource-sets/{id}/members | 创建资源集合成员
*PermissionApi* | [**deleteAuthUnitRules**](docs/PermissionApi.md#deleteAuthUnitRules) | **DELETE** /v1/batch/auth-unit-rules | 批量删除授权规则
*PermissionApi* | [**deleteResources**](docs/PermissionApi.md#deleteResources) | **DELETE** /v1/batch/resources | 删除资源
*PermissionApi* | [**getAuthUnit**](docs/PermissionApi.md#getAuthUnit) | **GET** /v1/auth-units/{id} | 按 ID 查询授权单元
*PermissionApi* | [**getAuthUnits**](docs/PermissionApi.md#getAuthUnits) | **GET** /v1/auth-units | 获取授权单元列表
*PermissionApi* | [**getAuthUnitsRules**](docs/PermissionApi.md#getAuthUnitsRules) | **GET** /v1/auth-units/{rid}/rules | 查询授权单元下的授权规则列表
*PermissionApi* | [**getResource**](docs/PermissionApi.md#getResource) | **GET** /v1/resources/{id} | 按 ID 查询资源
*PermissionApi* | [**getResourceMember**](docs/PermissionApi.md#getResourceMember) | **GET** /v1/resource-sets/{sid}/members/{mid} | 按 ID 查询资源集合成员
*PermissionApi* | [**getResourceMembers**](docs/PermissionApi.md#getResourceMembers) | **GET** /v1/resource-sets/{sid}/members | 查询资源集合成员列表
*PermissionApi* | [**getResourceSet**](docs/PermissionApi.md#getResourceSet) | **GET** /v1/resource-sets/{id} | 按 ID 查询资源集合
*PermissionApi* | [**getResourceSets**](docs/PermissionApi.md#getResourceSets) | **GET** /v1/resource-sets | 查询资源集合列表
*PermissionApi* | [**getResources**](docs/PermissionApi.md#getResources) | **GET** /v1/resources | 查询资源列表
*PermissionApi* | [**modifyAuthUnit**](docs/PermissionApi.md#modifyAuthUnit) | **PUT** /v1/auth-units/{rid}/rules/{tid} | 更新授权规则
*PermissionApi* | [**modifyResourceSet**](docs/PermissionApi.md#modifyResourceSet) | **PUT** /v1/resource-sets/{id} | 更新资源集合
*PermissionApi* | [**modifyResourceSetMember**](docs/PermissionApi.md#modifyResourceSetMember) | **PUT** /v1/resource-sets/{sid}/members/{mid} | 更新资源集合成员
*PermissionApi* | [**queryAuthUnitsRules**](docs/PermissionApi.md#queryAuthUnitsRules) | **GET** /v1/auth-unit-rules | 查询授权规则列表
*StorageApi* | [**deleteBucket**](docs/StorageApi.md#deleteBucket) | **DELETE** /v1/buckets/{bucket} | 删除 Bucket
*StorageApi* | [**deleteObject**](docs/StorageApi.md#deleteObject) | **DELETE** /v1/buckets/{bucket}/objects/{key} | 删除 Object
*StorageApi* | [**getBucket**](docs/StorageApi.md#getBucket) | **GET** /v1/buckets/{bucket} | 获取 Bucket 详情
*StorageApi* | [**getBuckets**](docs/StorageApi.md#getBuckets) | **GET** /v1/buckets | 获取 Bucket 列表
*StorageApi* | [**getObject**](docs/StorageApi.md#getObject) | **GET** /v1/buckets/{bucket}/objects/{key} | 获取 Object 详情
*StorageApi* | [**getObjects**](docs/StorageApi.md#getObjects) | **GET** /v1/buckets/{bucket}/objects | 获取 Object 列表
*StorageApi* | [**saveObject**](docs/StorageApi.md#saveObject) | **POST** /v1/buckets/{bucket}/objects | 创建 Object
*UserApi* | [**callList**](docs/UserApi.md#callList) | **GET** /v1/users | 查询用户列表
*UserApi* | [**create**](docs/UserApi.md#create) | **POST** /v1/users | 创建用户
*UserApi* | [**createStoreCredential**](docs/UserApi.md#createStoreCredential) | **POST** /v1/user-stored-credentials | 创建用户存储凭证
*UserApi* | [**delete**](docs/UserApi.md#delete) | **DELETE** /v1/users/{id} | 删除用户
*UserApi* | [**get**](docs/UserApi.md#get) | **GET** /v1/users/{id} | 查询用户详情
*UserApi* | [**getStoredCredentials**](docs/UserApi.md#getStoredCredentials) | **GET** /v1/user-stored-credentials | 查询用户存储凭证列表
*UserApi* | [**modify**](docs/UserApi.md#modify) | **PATCH** /v1/users/{id} | 编辑用户


## Documentation for Models

 - [AddNodeMembersReq](docs/AddNodeMembersReq.md)
 - [App](docs/App.md)
 - [AppConfig](docs/AppConfig.md)
 - [AppConfigAllowedIdProvider](docs/AppConfigAllowedIdProvider.md)
 - [AppConfigRet](docs/AppConfigRet.md)
 - [AppConfigRetMfaConfig](docs/AppConfigRetMfaConfig.md)
 - [AppSubAccount](docs/AppSubAccount.md)
 - [AppSubAccountWithPage](docs/AppSubAccountWithPage.md)
 - [AppWithPage](docs/AppWithPage.md)
 - [AppWithPageDataInner](docs/AppWithPageDataInner.md)
 - [Au](docs/Au.md)
 - [AuResourceSet](docs/AuResourceSet.md)
 - [AuthConfigEntity](docs/AuthConfigEntity.md)
 - [AuthConfigRet](docs/AuthConfigRet.md)
 - [AuthMethodRet](docs/AuthMethodRet.md)
 - [AuthMethodRetConfigFieldsInner](docs/AuthMethodRetConfigFieldsInner.md)
 - [AuthUnit](docs/AuthUnit.md)
 - [AuthUnitResouce](docs/AuthUnitResouce.md)
 - [AuthUnitResourceSet](docs/AuthUnitResourceSet.md)
 - [AuthUnitRet](docs/AuthUnitRet.md)
 - [AuthUnitWithPage](docs/AuthUnitWithPage.md)
 - [BadRequest](docs/BadRequest.md)
 - [BatchCreateAuthUnitRuleReq](docs/BatchCreateAuthUnitRuleReq.md)
 - [BatchCreateAuthUnitRuleReqIdentitiesInner](docs/BatchCreateAuthUnitRuleReqIdentitiesInner.md)
 - [BatchDeleteAuthUnitRuleReq](docs/BatchDeleteAuthUnitRuleReq.md)
 - [BatchDeleteOrgNodeReq](docs/BatchDeleteOrgNodeReq.md)
 - [BatchDeleteResourceReq](docs/BatchDeleteResourceReq.md)
 - [BatchDeleteUserReq](docs/BatchDeleteUserReq.md)
 - [BatchDeleteUserRet](docs/BatchDeleteUserRet.md)
 - [BatchDisableUserReq](docs/BatchDisableUserReq.md)
 - [BatchDisableUserRet](docs/BatchDisableUserRet.md)
 - [BatchEnableUserReq](docs/BatchEnableUserReq.md)
 - [BatchEnableUserRet](docs/BatchEnableUserRet.md)
 - [BatchResetPasswordReq](docs/BatchResetPasswordReq.md)
 - [BatchResetPasswordRet](docs/BatchResetPasswordRet.md)
 - [Bucket](docs/Bucket.md)
 - [CheckUserExistsReq](docs/CheckUserExistsReq.md)
 - [CommonRet](docs/CommonRet.md)
 - [CreateAccount200Response](docs/CreateAccount200Response.md)
 - [CreateAccountRequest](docs/CreateAccountRequest.md)
 - [CreateAppIDPReq](docs/CreateAppIDPReq.md)
 - [CreateAppReq](docs/CreateAppReq.md)
 - [CreateAppReqConfigProp](docs/CreateAppReqConfigProp.md)
 - [CreateAppReqConfigPropAccessPolicy](docs/CreateAppReqConfigPropAccessPolicy.md)
 - [CreateAppReqConfigPropAllowedLoginMethod](docs/CreateAppReqConfigPropAllowedLoginMethod.md)
 - [CreateAppReqConfigPropAllowedSocialLoginProvider](docs/CreateAppReqConfigPropAllowedSocialLoginProvider.md)
 - [CreateAppReqProtocolProp](docs/CreateAppReqProtocolProp.md)
 - [CreateAppReqProtocolPropResponseAttrInner](docs/CreateAppReqProtocolPropResponseAttrInner.md)
 - [CreateAppReqTemplateParams](docs/CreateAppReqTemplateParams.md)
 - [CreateAuthConfigReq](docs/CreateAuthConfigReq.md)
 - [CreateAuthConfigReqConfigFields](docs/CreateAuthConfigReqConfigFields.md)
 - [CreateAuthConfigRet](docs/CreateAuthConfigRet.md)
 - [CreateIDPConnectionReq](docs/CreateIDPConnectionReq.md)
 - [CreateIDPConnectionReqConfigFields](docs/CreateIDPConnectionReqConfigFields.md)
 - [CreateIDPConnectionRet](docs/CreateIDPConnectionRet.md)
 - [CreateNodeRequest](docs/CreateNodeRequest.md)
 - [CreateOrganizationReq](docs/CreateOrganizationReq.md)
 - [CreateResourceReq](docs/CreateResourceReq.md)
 - [CreateResourceSetMemberReq](docs/CreateResourceSetMemberReq.md)
 - [CreateResourceSetMemberRet](docs/CreateResourceSetMemberRet.md)
 - [CreateResourceSetReq](docs/CreateResourceSetReq.md)
 - [CreateResourceSetRet](docs/CreateResourceSetRet.md)
 - [CreateResoureRet](docs/CreateResoureRet.md)
 - [CreateUserReq](docs/CreateUserReq.md)
 - [CreateUserStoredCredentialReq](docs/CreateUserStoredCredentialReq.md)
 - [DeleteAppRet](docs/DeleteAppRet.md)
 - [DeleteAuthConfigRet](docs/DeleteAuthConfigRet.md)
 - [DeleteAuthConfigRetConfigFields](docs/DeleteAuthConfigRetConfigFields.md)
 - [DeleteIDPConnectionRet](docs/DeleteIDPConnectionRet.md)
 - [DeleteIDPConnectionRetConfigFields](docs/DeleteIDPConnectionRetConfigFields.md)
 - [DeleteNodeMemberReq](docs/DeleteNodeMemberReq.md)
 - [Disable200Response](docs/Disable200Response.md)
 - [EmptyObject](docs/EmptyObject.md)
 - [EnableAppProtocolRet](docs/EnableAppProtocolRet.md)
 - [EnableAppRet](docs/EnableAppRet.md)
 - [GetAccounts200Response](docs/GetAccounts200Response.md)
 - [GetMembers200ResponseInner](docs/GetMembers200ResponseInner.md)
 - [IDPConnectionRet](docs/IDPConnectionRet.md)
 - [IDPTestReq](docs/IDPTestReq.md)
 - [IdentityObj](docs/IdentityObj.md)
 - [KeyValuePair](docs/KeyValuePair.md)
 - [MFA](docs/MFA.md)
 - [ModelObject](docs/ModelObject.md)
 - [ModifyAccountRequest](docs/ModifyAccountRequest.md)
 - [ModifyAppConfigReq](docs/ModifyAppConfigReq.md)
 - [ModifyAppConfigRet](docs/ModifyAppConfigRet.md)
 - [ModifyAppProtocol](docs/ModifyAppProtocol.md)
 - [ModifyAppReq](docs/ModifyAppReq.md)
 - [ModifyAppReqProtocols](docs/ModifyAppReqProtocols.md)
 - [ModifyAppReqProtocolsOidc](docs/ModifyAppReqProtocolsOidc.md)
 - [ModifyAppReqTemplateParams](docs/ModifyAppReqTemplateParams.md)
 - [ModifyAppRet](docs/ModifyAppRet.md)
 - [ModifyAuthConfigReq](docs/ModifyAuthConfigReq.md)
 - [ModifyAuthConfigReqConfigFields](docs/ModifyAuthConfigReqConfigFields.md)
 - [ModifyAuthConfigRet](docs/ModifyAuthConfigRet.md)
 - [ModifyAuthRuleReq](docs/ModifyAuthRuleReq.md)
 - [ModifyAuthUnitRequest](docs/ModifyAuthUnitRequest.md)
 - [ModifyIDPConnectionReq](docs/ModifyIDPConnectionReq.md)
 - [ModifyIDPConnectionReqConfigFields](docs/ModifyIDPConnectionReqConfigFields.md)
 - [ModifyIDPConnectionRet](docs/ModifyIDPConnectionRet.md)
 - [ModifyNodeMemberReq](docs/ModifyNodeMemberReq.md)
 - [ModifyOrganizationNodeReq](docs/ModifyOrganizationNodeReq.md)
 - [ModifyOrganizationReq](docs/ModifyOrganizationReq.md)
 - [ModifyPasswordReq](docs/ModifyPasswordReq.md)
 - [ModifyResourceReq](docs/ModifyResourceReq.md)
 - [ModifyResourceReqActionsInner](docs/ModifyResourceReqActionsInner.md)
 - [ModifyResourceSetMemberReq](docs/ModifyResourceSetMemberReq.md)
 - [ModifyResourceSetMemberReqResourceActionsInner](docs/ModifyResourceSetMemberReqResourceActionsInner.md)
 - [ModifyResourceSetReq](docs/ModifyResourceSetReq.md)
 - [ModifyUserReq](docs/ModifyUserReq.md)
 - [NodeMemberWithPage](docs/NodeMemberWithPage.md)
 - [NodeMemberWithPageDataInner](docs/NodeMemberWithPageDataInner.md)
 - [NodeMemberWithPageDataInnerNodeInfoInner](docs/NodeMemberWithPageDataInnerNodeInfoInner.md)
 - [NodeUserPair](docs/NodeUserPair.md)
 - [OrganizationTree](docs/OrganizationTree.md)
 - [RefreshAppSecretRet](docs/RefreshAppSecretRet.md)
 - [RefreshAppSecretRetData](docs/RefreshAppSecretRetData.md)
 - [ResetAppProtocolSecretRet](docs/ResetAppProtocolSecretRet.md)
 - [ResetPasswordReq](docs/ResetPasswordReq.md)
 - [Resource](docs/Resource.md)
 - [ResourceEntity](docs/ResourceEntity.md)
 - [ResourceEntity1](docs/ResourceEntity1.md)
 - [ResourceSet](docs/ResourceSet.md)
 - [ResourceSetEntity](docs/ResourceSetEntity.md)
 - [ResourceSetMember](docs/ResourceSetMember.md)
 - [ResourceSetMemberResourceActions](docs/ResourceSetMemberResourceActions.md)
 - [ResourceSetMemberWithPage](docs/ResourceSetMemberWithPage.md)
 - [ResourceSetWithPage](docs/ResourceSetWithPage.md)
 - [ResourceWithPage](docs/ResourceWithPage.md)
 - [TreeNode](docs/TreeNode.md)
 - [TreeUser](docs/TreeUser.md)
 - [UserDetailRet](docs/UserDetailRet.md)
 - [UserRet](docs/UserRet.md)
 - [UserStoredCredential](docs/UserStoredCredential.md)
 - [UserStoredCredentialWithPage](docs/UserStoredCredentialWithPage.md)
 - [UserWithPage](docs/UserWithPage.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



