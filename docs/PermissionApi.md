# PermissionApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAuthUnitRules**](PermissionApi.md#createAuthUnitRules) | **POST** /v1/batch/auth-unit-rules | 批量创建授权规则 |
| [**createResource**](PermissionApi.md#createResource) | **POST** /v1/resources | 创建资源 |
| [**createResourceSet**](PermissionApi.md#createResourceSet) | **POST** /v1/resource-sets | 创建资源集合 |
| [**createResourceSetMember**](PermissionApi.md#createResourceSetMember) | **POST** /v1/resource-sets/{id}/members | 创建资源集合成员 |
| [**deleteAuthUnitRules**](PermissionApi.md#deleteAuthUnitRules) | **DELETE** /v1/batch/auth-unit-rules | 批量删除授权规则 |
| [**deleteResources**](PermissionApi.md#deleteResources) | **DELETE** /v1/batch/resources | 删除资源 |
| [**getAuthUnit**](PermissionApi.md#getAuthUnit) | **GET** /v1/auth-units/{id} | 按 ID 查询授权单元 |
| [**getAuthUnits**](PermissionApi.md#getAuthUnits) | **GET** /v1/auth-units | 获取授权单元列表 |
| [**getAuthUnitsRules**](PermissionApi.md#getAuthUnitsRules) | **GET** /v1/auth-units/{rid}/rules | 查询授权单元下的授权规则列表 |
| [**getResource**](PermissionApi.md#getResource) | **GET** /v1/resources/{id} | 按 ID 查询资源 |
| [**getResourceMember**](PermissionApi.md#getResourceMember) | **GET** /v1/resource-sets/{sid}/members/{mid} | 按 ID 查询资源集合成员 |
| [**getResourceMembers**](PermissionApi.md#getResourceMembers) | **GET** /v1/resource-sets/{sid}/members | 查询资源集合成员列表 |
| [**getResourceSet**](PermissionApi.md#getResourceSet) | **GET** /v1/resource-sets/{id} | 按 ID 查询资源集合 |
| [**getResourceSets**](PermissionApi.md#getResourceSets) | **GET** /v1/resource-sets | 查询资源集合列表 |
| [**getResources**](PermissionApi.md#getResources) | **GET** /v1/resources | 查询资源列表 |
| [**modifyAuthUnit**](PermissionApi.md#modifyAuthUnit) | **PUT** /v1/auth-units/{rid}/rules/{tid} | 更新授权规则 |
| [**modifyResourceSet**](PermissionApi.md#modifyResourceSet) | **PUT** /v1/resource-sets/{id} | 更新资源集合 |
| [**modifyResourceSetMember**](PermissionApi.md#modifyResourceSetMember) | **PUT** /v1/resource-sets/{sid}/members/{mid} | 更新资源集合成员 |
| [**queryAuthUnitsRules**](PermissionApi.md#queryAuthUnitsRules) | **GET** /v1/auth-unit-rules | 查询授权规则列表 |


<a id="createAuthUnitRules"></a>
# **createAuthUnitRules**
> Object createAuthUnitRules(contentType).xTenantId(xTenantId).batchCreateAuthUnitRuleReq(batchCreateAuthUnitRuleReq).execute();

批量创建授权规则



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String contentType = "application/json"; // String | 
    String xTenantId = "123"; // String | token为开发者身份时必填
    BatchCreateAuthUnitRuleReq batchCreateAuthUnitRuleReq = new BatchCreateAuthUnitRuleReq(); // BatchCreateAuthUnitRuleReq | 
    try {
      Object result = apiInstance.createAuthUnitRules(contentType)
            .xTenantId(xTenantId)
            .batchCreateAuthUnitRuleReq(batchCreateAuthUnitRuleReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#createAuthUnitRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | |
| **xTenantId** | **String**| token为开发者身份时必填 | [optional] |
| **batchCreateAuthUnitRuleReq** | [**BatchCreateAuthUnitRuleReq**](BatchCreateAuthUnitRuleReq.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="createResource"></a>
# **createResource**
> CreateResoureRet createResource(contentType).createResourceReq(createResourceReq).execute();

创建资源



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String contentType = "application/json"; // String | 
    CreateResourceReq createResourceReq = new CreateResourceReq(); // CreateResourceReq | 
    try {
      CreateResoureRet result = apiInstance.createResource(contentType)
            .createResourceReq(createResourceReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#createResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | |
| **createResourceReq** | [**CreateResourceReq**](CreateResourceReq.md)|  | [optional] |

### Return type

[**CreateResoureRet**](CreateResoureRet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="createResourceSet"></a>
# **createResourceSet**
> CreateResourceSetRet createResourceSet(contentType, xTenantId).createResourceSetReq(createResourceSetReq).execute();

创建资源集合



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String contentType = "application/json"; // String | 
    String xTenantId = "123"; // String | 租户id
    CreateResourceSetReq createResourceSetReq = new CreateResourceSetReq(); // CreateResourceSetReq | 
    try {
      CreateResourceSetRet result = apiInstance.createResourceSet(contentType, xTenantId)
            .createResourceSetReq(createResourceSetReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#createResourceSet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | |
| **xTenantId** | **String**| 租户id | |
| **createResourceSetReq** | [**CreateResourceSetReq**](CreateResourceSetReq.md)|  | [optional] |

### Return type

[**CreateResourceSetRet**](CreateResourceSetRet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="createResourceSetMember"></a>
# **createResourceSetMember**
> CreateResourceSetMemberRet createResourceSetMember(id, contentType).createResourceSetMemberReq(createResourceSetMemberReq).execute();

创建资源集合成员



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String id = "id_example"; // String | 集合id
    String contentType = "application/json"; // String | 
    CreateResourceSetMemberReq createResourceSetMemberReq = new CreateResourceSetMemberReq(); // CreateResourceSetMemberReq | 
    try {
      CreateResourceSetMemberRet result = apiInstance.createResourceSetMember(id, contentType)
            .createResourceSetMemberReq(createResourceSetMemberReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#createResourceSetMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| 集合id | |
| **contentType** | **String**|  | |
| **createResourceSetMemberReq** | [**CreateResourceSetMemberReq**](CreateResourceSetMemberReq.md)|  | [optional] |

### Return type

[**CreateResourceSetMemberRet**](CreateResourceSetMemberRet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="deleteAuthUnitRules"></a>
# **deleteAuthUnitRules**
> Object deleteAuthUnitRules(contentType).batchDeleteAuthUnitRuleReq(batchDeleteAuthUnitRuleReq).execute();

批量删除授权规则



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String contentType = "application/x-www-form-urlencoded"; // String | 
    BatchDeleteAuthUnitRuleReq batchDeleteAuthUnitRuleReq = new BatchDeleteAuthUnitRuleReq(); // BatchDeleteAuthUnitRuleReq | 
    try {
      Object result = apiInstance.deleteAuthUnitRules(contentType)
            .batchDeleteAuthUnitRuleReq(batchDeleteAuthUnitRuleReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#deleteAuthUnitRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | |
| **batchDeleteAuthUnitRuleReq** | [**BatchDeleteAuthUnitRuleReq**](BatchDeleteAuthUnitRuleReq.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="deleteResources"></a>
# **deleteResources**
> Object deleteResources(contentType).batchDeleteResourceReq(batchDeleteResourceReq).execute();

删除资源



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String contentType = "application/x-www-form-urlencoded"; // String | 
    BatchDeleteResourceReq batchDeleteResourceReq = new BatchDeleteResourceReq(); // BatchDeleteResourceReq | 
    try {
      Object result = apiInstance.deleteResources(contentType)
            .batchDeleteResourceReq(batchDeleteResourceReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#deleteResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | |
| **batchDeleteResourceReq** | [**BatchDeleteResourceReq**](BatchDeleteResourceReq.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getAuthUnit"></a>
# **getAuthUnit**
> AuthUnitRet getAuthUnit(id).execute();

按 ID 查询授权单元



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String id = "id_example"; // String | au id
    try {
      AuthUnitRet result = apiInstance.getAuthUnit(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#getAuthUnit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| au id | |

### Return type

[**AuthUnitRet**](AuthUnitRet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getAuthUnits"></a>
# **getAuthUnits**
> AuthUnitWithPage getAuthUnits().identityId(identityId).identityType(identityType).identityName(identityName).pageNum(pageNum).pageSize(pageSize).pageSort(pageSort).execute();

获取授权单元列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String identityId = "identityId_example"; // String | 主体id
    String identityType = ""; // String | 主体类型
    String identityName = ""; // String | 主体名称
    String pageNum = ""; // String | 起始页，默认1
    String pageSize = ""; // String | 页大小，默认20
    String pageSort = ""; // String | 排序方式，格式：字段[排序方式]
    try {
      AuthUnitWithPage result = apiInstance.getAuthUnits()
            .identityId(identityId)
            .identityType(identityType)
            .identityName(identityName)
            .pageNum(pageNum)
            .pageSize(pageSize)
            .pageSort(pageSort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#getAuthUnits");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identityId** | **String**| 主体id | [optional] |
| **identityType** | **String**| 主体类型 | [optional] |
| **identityName** | **String**| 主体名称 | [optional] |
| **pageNum** | **String**| 起始页，默认1 | [optional] |
| **pageSize** | **String**| 页大小，默认20 | [optional] |
| **pageSort** | **String**| 排序方式，格式：字段[排序方式] | [optional] |

### Return type

[**AuthUnitWithPage**](AuthUnitWithPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getAuthUnitsRules"></a>
# **getAuthUnitsRules**
> List&lt;Au&gt; getAuthUnitsRules(rid).applicationId(applicationId).type(type).code(code).selfOnly(selfOnly).resourceId(resourceId).resourceMatchAllResources(resourceMatchAllResources).resourceMatchAllActions(resourceMatchAllActions).resourceSetId(resourceSetId).pageMode(pageMode).execute();

查询授权单元下的授权规则列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String rid = "rid_example"; // String | AU id
    String applicationId = "applicationId_example"; // String | 应用id
    String type = "res,res_set,data,ui,app"; // String | 规则类型
    String code = ""; // String | 资源或资源集合code
    String selfOnly = "true"; // String | 只查询指定主体下的授权
    String resourceId = ""; // String | 资源id，当type=api,ui,data时有效
    String resourceMatchAllResources = "false"; // String | 匹配所有资源，当type=res时有效
    String resourceMatchAllActions = "false"; // String | 匹配所有资源操作，当type=res时有效
    String resourceSetId = ""; // String | 资源集合id，当type=res_set
    String pageMode = "pageMode_example"; // String | 分页方式，格式：0不分页，1分页，默认为1
    try {
      List<Au> result = apiInstance.getAuthUnitsRules(rid)
            .applicationId(applicationId)
            .type(type)
            .code(code)
            .selfOnly(selfOnly)
            .resourceId(resourceId)
            .resourceMatchAllResources(resourceMatchAllResources)
            .resourceMatchAllActions(resourceMatchAllActions)
            .resourceSetId(resourceSetId)
            .pageMode(pageMode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#getAuthUnitsRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rid** | **String**| AU id | |
| **applicationId** | **String**| 应用id | [optional] |
| **type** | **String**| 规则类型 | [optional] |
| **code** | **String**| 资源或资源集合code | [optional] |
| **selfOnly** | **String**| 只查询指定主体下的授权 | [optional] |
| **resourceId** | **String**| 资源id，当type&#x3D;api,ui,data时有效 | [optional] |
| **resourceMatchAllResources** | **String**| 匹配所有资源，当type&#x3D;res时有效 | [optional] |
| **resourceMatchAllActions** | **String**| 匹配所有资源操作，当type&#x3D;res时有效 | [optional] |
| **resourceSetId** | **String**| 资源集合id，当type&#x3D;res_set | [optional] |
| **pageMode** | **String**| 分页方式，格式：0不分页，1分页，默认为1 | [optional] |

### Return type

[**List&lt;Au&gt;**](Au.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getResource"></a>
# **getResource**
> ResourceEntity getResource(id, applicationId).execute();

按 ID 查询资源



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String id = "id_example"; // String | 资源id
    String applicationId = ""; // String | 应用id
    try {
      ResourceEntity result = apiInstance.getResource(id, applicationId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#getResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| 资源id | |
| **applicationId** | **String**| 应用id | |

### Return type

[**ResourceEntity**](ResourceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getResourceMember"></a>
# **getResourceMember**
> ResourceSetMember getResourceMember(sid, mid).execute();

按 ID 查询资源集合成员



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String sid = "sid_example"; // String | 资源集合id
    String mid = "mid_example"; // String | 成员id
    try {
      ResourceSetMember result = apiInstance.getResourceMember(sid, mid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#getResourceMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sid** | **String**| 资源集合id | |
| **mid** | **String**| 成员id | |

### Return type

[**ResourceSetMember**](ResourceSetMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getResourceMembers"></a>
# **getResourceMembers**
> ResourceSetMemberWithPage getResourceMembers(sid).resourceCode(resourceCode).resourceType(resourceType).pageNum(pageNum).pageSize(pageSize).pageSort(pageSort).execute();

查询资源集合成员列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String sid = "sid_example"; // String | 资源集合id
    String resourceCode = ""; // String | 资源代码
    String resourceType = ""; // String | 资源类型
    String pageNum = ""; // String | 起始页，默认1
    String pageSize = ""; // String | 页大小，默认20
    String pageSort = ""; // String | 排序方式，格式：字段[排序方式]
    try {
      ResourceSetMemberWithPage result = apiInstance.getResourceMembers(sid)
            .resourceCode(resourceCode)
            .resourceType(resourceType)
            .pageNum(pageNum)
            .pageSize(pageSize)
            .pageSort(pageSort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#getResourceMembers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sid** | **String**| 资源集合id | |
| **resourceCode** | **String**| 资源代码 | [optional] |
| **resourceType** | **String**| 资源类型 | [optional] |
| **pageNum** | **String**| 起始页，默认1 | [optional] |
| **pageSize** | **String**| 页大小，默认20 | [optional] |
| **pageSort** | **String**| 排序方式，格式：字段[排序方式] | [optional] |

### Return type

[**ResourceSetMemberWithPage**](ResourceSetMemberWithPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getResourceSet"></a>
# **getResourceSet**
> ResourceSet getResourceSet(id).execute();

按 ID 查询资源集合



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String id = "id_example"; // String | 资源集合id
    try {
      ResourceSet result = apiInstance.getResourceSet(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#getResourceSet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| 资源集合id | |

### Return type

[**ResourceSet**](ResourceSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getResourceSets"></a>
# **getResourceSets**
> ResourceSetWithPage getResourceSets(applicationId).code(code).includeGlobal(includeGlobal).pageNum(pageNum).pageSize(pageSize).pageSort(pageSort).execute();

查询资源集合列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String applicationId = ""; // String | 应用id
    String code = "code_example"; // String | 集合代码
    String includeGlobal = "true"; // String | 查询是否包含全局资源集合
    String pageNum = ""; // String | 起始页，默认1
    String pageSize = ""; // String | 页大小，默认20
    String pageSort = ""; // String | 排序方式，格式：字段[排序方式]
    try {
      ResourceSetWithPage result = apiInstance.getResourceSets(applicationId)
            .code(code)
            .includeGlobal(includeGlobal)
            .pageNum(pageNum)
            .pageSize(pageSize)
            .pageSort(pageSort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#getResourceSets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **String**| 应用id | |
| **code** | **String**| 集合代码 | [optional] |
| **includeGlobal** | **String**| 查询是否包含全局资源集合 | [optional] |
| **pageNum** | **String**| 起始页，默认1 | [optional] |
| **pageSize** | **String**| 页大小，默认20 | [optional] |
| **pageSort** | **String**| 排序方式，格式：字段[排序方式] | [optional] |

### Return type

[**ResourceSetWithPage**](ResourceSetWithPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getResources"></a>
# **getResources**
> ResourceWithPage getResources(applicationId).type(type).code(code).includeGlobal(includeGlobal).pageNum(pageNum).pageSize(pageSize).pageSort(pageSort).pageMode(pageMode).execute();

查询资源列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String applicationId = ""; // String | 应用id
    String type = ""; // String | 资源类型
    String code = ""; // String | 资源代码
    String includeGlobal = "true"; // String | 是否查询包含全局资源
    String pageNum = ""; // String | 起始页，默认1
    String pageSize = ""; // String | 页大小，默认20
    String pageSort = ""; // String | 排序方式，格式：字段[排序方式]
    String pageMode = "pageMode_example"; // String | 分页方式，格式：0不分页，1分页，默认为1
    try {
      ResourceWithPage result = apiInstance.getResources(applicationId)
            .type(type)
            .code(code)
            .includeGlobal(includeGlobal)
            .pageNum(pageNum)
            .pageSize(pageSize)
            .pageSort(pageSort)
            .pageMode(pageMode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#getResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationId** | **String**| 应用id | |
| **type** | **String**| 资源类型 | [optional] |
| **code** | **String**| 资源代码 | [optional] |
| **includeGlobal** | **String**| 是否查询包含全局资源 | [optional] |
| **pageNum** | **String**| 起始页，默认1 | [optional] |
| **pageSize** | **String**| 页大小，默认20 | [optional] |
| **pageSort** | **String**| 排序方式，格式：字段[排序方式] | [optional] |
| **pageMode** | **String**| 分页方式，格式：0不分页，1分页，默认为1 | [optional] |

### Return type

[**ResourceWithPage**](ResourceWithPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="modifyAuthUnit"></a>
# **modifyAuthUnit**
> Object modifyAuthUnit(rid, tid, contentType).modifyAuthUnitRequest(modifyAuthUnitRequest).execute();

更新授权规则



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String rid = "rid_example"; // String | AU id
    String tid = "tid_example"; // String | 规则id
    String contentType = "application/json"; // String | 
    ModifyAuthUnitRequest modifyAuthUnitRequest = new ModifyAuthUnitRequest(); // ModifyAuthUnitRequest | 
    try {
      Object result = apiInstance.modifyAuthUnit(rid, tid, contentType)
            .modifyAuthUnitRequest(modifyAuthUnitRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#modifyAuthUnit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **rid** | **String**| AU id | |
| **tid** | **String**| 规则id | |
| **contentType** | **String**|  | |
| **modifyAuthUnitRequest** | [**ModifyAuthUnitRequest**](ModifyAuthUnitRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="modifyResourceSet"></a>
# **modifyResourceSet**
> Object modifyResourceSet(id, contentType, xTenantId).modifyResourceSetReq(modifyResourceSetReq).execute();

更新资源集合



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String id = "id_example"; // String | 集合id
    String contentType = "application/json"; // String | 
    String xTenantId = "xTenantId_example"; // String | 租户id
    ModifyResourceSetReq modifyResourceSetReq = new ModifyResourceSetReq(); // ModifyResourceSetReq | 
    try {
      Object result = apiInstance.modifyResourceSet(id, contentType, xTenantId)
            .modifyResourceSetReq(modifyResourceSetReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#modifyResourceSet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| 集合id | |
| **contentType** | **String**|  | |
| **xTenantId** | **String**| 租户id | |
| **modifyResourceSetReq** | [**ModifyResourceSetReq**](ModifyResourceSetReq.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="modifyResourceSetMember"></a>
# **modifyResourceSetMember**
> Object modifyResourceSetMember(sid, mid, contentType).modifyResourceSetMemberReq(modifyResourceSetMemberReq).execute();

更新资源集合成员



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String sid = "sid_example"; // String | 资源集合id
    String mid = "mid_example"; // String | 资源集合成员id
    String contentType = "application/json"; // String | 
    ModifyResourceSetMemberReq modifyResourceSetMemberReq = new ModifyResourceSetMemberReq(); // ModifyResourceSetMemberReq | 
    try {
      Object result = apiInstance.modifyResourceSetMember(sid, mid, contentType)
            .modifyResourceSetMemberReq(modifyResourceSetMemberReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#modifyResourceSetMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sid** | **String**| 资源集合id | |
| **mid** | **String**| 资源集合成员id | |
| **contentType** | **String**|  | |
| **modifyResourceSetMemberReq** | [**ModifyResourceSetMemberReq**](ModifyResourceSetMemberReq.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="queryAuthUnitsRules"></a>
# **queryAuthUnitsRules**
> List&lt;Au&gt; queryAuthUnitsRules(identityId, identityType).applicationId(applicationId).type(type).code(code).identityName(identityName).selfOnly(selfOnly).resourceId(resourceId).resourceMatchAllResources(resourceMatchAllResources).resourceMatchAllActions(resourceMatchAllActions).resourceSetId(resourceSetId).pageMode(pageMode).execute();

查询授权规则列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.PermissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    PermissionApi apiInstance = new PermissionApi(defaultClient);
    String identityId = "identityId_example"; // String | 主体id
    String identityType = "user, node"; // String | 主体类型
    String applicationId = "applicationId_example"; // String | 应用id
    String type = "api, ui, data, res_set, app"; // String | 规则类型
    String code = "code_example"; // String | 资源或资源集合code
    String identityName = "identityName_example"; // String | 主体名称
    String selfOnly = "true"; // String | 只查询指定主体下的授权
    String resourceId = "resourceId_example"; // String | 资源id，当type=api,ui,data时有效
    String resourceMatchAllResources = "resourceMatchAllResources_example"; // String | 匹配所有资源，当type=res时有效
    String resourceMatchAllActions = "resourceMatchAllActions_example"; // String | 匹配所有资源操作，当type=res时有效
    String resourceSetId = "resourceSetId_example"; // String | 资源集合id，当type=res_set
    String pageMode = "pageMode_example"; // String | 分页方式，格式：0不分页，1分页，默认为1
    try {
      List<Au> result = apiInstance.queryAuthUnitsRules(identityId, identityType)
            .applicationId(applicationId)
            .type(type)
            .code(code)
            .identityName(identityName)
            .selfOnly(selfOnly)
            .resourceId(resourceId)
            .resourceMatchAllResources(resourceMatchAllResources)
            .resourceMatchAllActions(resourceMatchAllActions)
            .resourceSetId(resourceSetId)
            .pageMode(pageMode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PermissionApi#queryAuthUnitsRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identityId** | **String**| 主体id | |
| **identityType** | **String**| 主体类型 | |
| **applicationId** | **String**| 应用id | [optional] |
| **type** | **String**| 规则类型 | [optional] |
| **code** | **String**| 资源或资源集合code | [optional] |
| **identityName** | **String**| 主体名称 | [optional] |
| **selfOnly** | **String**| 只查询指定主体下的授权 | [optional] |
| **resourceId** | **String**| 资源id，当type&#x3D;api,ui,data时有效 | [optional] |
| **resourceMatchAllResources** | **String**| 匹配所有资源，当type&#x3D;res时有效 | [optional] |
| **resourceMatchAllActions** | **String**| 匹配所有资源操作，当type&#x3D;res时有效 | [optional] |
| **resourceSetId** | **String**| 资源集合id，当type&#x3D;res_set | [optional] |
| **pageMode** | **String**| 分页方式，格式：0不分页，1分页，默认为1 | [optional] |

### Return type

[**List&lt;Au&gt;**](Au.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

