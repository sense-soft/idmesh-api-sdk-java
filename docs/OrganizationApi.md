# OrganizationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNode**](OrganizationApi.md#createNode) | **POST** /v1/tree-nodes | 创建节点 |
| [**createOrganization**](OrganizationApi.md#createOrganization) | **POST** /v1/core-objects | 创建组织关系 |
| [**deleteMembers**](OrganizationApi.md#deleteMembers) | **DELETE** /v1/tree-users | 从节点移除用户 |
| [**deleteNode**](OrganizationApi.md#deleteNode) | **DELETE** /v1/tree-nodes/{id} | 删除节点 |
| [**deleteOrganization**](OrganizationApi.md#deleteOrganization) | **DELETE** /v1/core-objects/{id} | 删除组织关系 |
| [**getChildrenNodes**](OrganizationApi.md#getChildrenNodes) | **GET** /v1/tree-nodes/{id}/children | 获取子节点列表 |
| [**getMembers**](OrganizationApi.md#getMembers) | **GET** /v1/tree-users | 获取与用户关联的组织关系列表 |
| [**getNode**](OrganizationApi.md#getNode) | **GET** /v1/tree-nodes/{id} | 查询节点信息 |
| [**getNodeMembers**](OrganizationApi.md#getNodeMembers) | **GET** /v1/tree-nodes/{id}/tree-users | 获取成员信息列表 |
| [**getNodeParent**](OrganizationApi.md#getNodeParent) | **GET** /v1/tree-nodes/{id}/parent | 查询父节点 |
| [**getNodes**](OrganizationApi.md#getNodes) | **GET** /v1/tree-nodes | 查询节点信息列表 |
| [**getOrganization**](OrganizationApi.md#getOrganization) | **GET** /v1/core-objects/{id} | 获取组织关系基本信息 |
| [**getOrganizations**](OrganizationApi.md#getOrganizations) | **GET** /v1/core-objects | 获取组织关系列表 |
| [**updateMember**](OrganizationApi.md#updateMember) | **PATCH** /v1/tree-users/{id} | 更新用户节点 |
| [**updateNode**](OrganizationApi.md#updateNode) | **PATCH** /v1/tree-nodes/{id} | 编辑节点 |
| [**updateOrganization**](OrganizationApi.md#updateOrganization) | **PATCH** /v1/core-objects/{id} | 修改组织关系基本信息 |


<a id="createNode"></a>
# **createNode**
> CommonRet createNode(contentType).createNodeRequest(createNodeRequest).execute();

创建节点



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String contentType = "application/json"; // String | 
    CreateNodeRequest createNodeRequest = new CreateNodeRequest(); // CreateNodeRequest | 
    try {
      CommonRet result = apiInstance.createNode(contentType)
            .createNodeRequest(createNodeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#createNode");
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
| **createNodeRequest** | [**CreateNodeRequest**](CreateNodeRequest.md)|  | [optional] |

### Return type

[**CommonRet**](CommonRet.md)

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

<a id="createOrganization"></a>
# **createOrganization**
> CommonRet createOrganization(contentType).createOrganizationReq(createOrganizationReq).execute();

创建组织关系

创建组织关系的元数据，同时创建根节点

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String contentType = "application/json"; // String | 
    CreateOrganizationReq createOrganizationReq = new CreateOrganizationReq(); // CreateOrganizationReq | 
    try {
      CommonRet result = apiInstance.createOrganization(contentType)
            .createOrganizationReq(createOrganizationReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#createOrganization");
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
| **createOrganizationReq** | [**CreateOrganizationReq**](CreateOrganizationReq.md)|  | [optional] |

### Return type

[**CommonRet**](CommonRet.md)

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

<a id="deleteMembers"></a>
# **deleteMembers**
> CommonRet deleteMembers(contentType).deleteNodeMemberReq(deleteNodeMemberReq).execute();

从节点移除用户

移除用户,uri参数中的ID和json中的参数，至少有其一

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String contentType = "application/x-www-form-urlencoded"; // String | 
    DeleteNodeMemberReq deleteNodeMemberReq = new DeleteNodeMemberReq(); // DeleteNodeMemberReq | 
    try {
      CommonRet result = apiInstance.deleteMembers(contentType)
            .deleteNodeMemberReq(deleteNodeMemberReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#deleteMembers");
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
| **deleteNodeMemberReq** | [**DeleteNodeMemberReq**](DeleteNodeMemberReq.md)|  | [optional] |

### Return type

[**CommonRet**](CommonRet.md)

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

<a id="deleteNode"></a>
# **deleteNode**
> CommonRet deleteNode(id, objectCode, contentType).execute();

删除节点

如果该节点有子节点则不可删除，需要先删除所有子节点。

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = "id_example"; // String | 
    String objectCode = "org_tree"; // String | 树对象code
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      CommonRet result = apiInstance.deleteNode(id, objectCode, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#deleteNode");
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
| **id** | **String**|  | |
| **objectCode** | **String**| 树对象code | |
| **contentType** | **String**|  | |

### Return type

[**CommonRet**](CommonRet.md)

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

<a id="deleteOrganization"></a>
# **deleteOrganization**
> CommonRet deleteOrganization(id, contentType).execute();

删除组织关系

如果该组织关系有子节点则不可删

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = "id_example"; // String | 
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      CommonRet result = apiInstance.deleteOrganization(id, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#deleteOrganization");
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
| **id** | **String**|  | |
| **contentType** | **String**|  | |

### Return type

[**CommonRet**](CommonRet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 成功 |  -  |
| **400** | BadRequest |  -  |

<a id="getChildrenNodes"></a>
# **getChildrenNodes**
> List&lt;TreeNode&gt; getChildrenNodes(id, mode, objectCode).execute();

获取子节点列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = "id_example"; // String | 
    String mode = "001"; // String | // mode - 低->高 bit // 第1位：是否获得指针节点所对应的真实结点，1-是，0-否 // 第2位：是否展开WeakNode，即节点中类型不同的节点，1-展开，0-不展开 // 第3位：是否递归地展开节点（不建议）
    String objectCode = "objectCode_example"; // String | 当id = 0时必填，创建树时的object_code
    try {
      List<TreeNode> result = apiInstance.getChildrenNodes(id, mode, objectCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getChildrenNodes");
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
| **id** | **String**|  | |
| **mode** | **String**| // mode - 低-&gt;高 bit // 第1位：是否获得指针节点所对应的真实结点，1-是，0-否 // 第2位：是否展开WeakNode，即节点中类型不同的节点，1-展开，0-不展开 // 第3位：是否递归地展开节点（不建议） | |
| **objectCode** | **String**| 当id &#x3D; 0时必填，创建树时的object_code | |

### Return type

[**List&lt;TreeNode&gt;**](TreeNode.md)

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

<a id="getMembers"></a>
# **getMembers**
> List&lt;GetMembers200ResponseInner&gt; getMembers(userId).objectCode(objectCode).execute();

获取与用户关联的组织关系列表

根据用户id获取与用户关联的组织关系列表

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String userId = "userId_example"; // String | 用户ID
    String objectCode = "objectCode_example"; // String | 组织编码
    try {
      List<GetMembers200ResponseInner> result = apiInstance.getMembers(userId)
            .objectCode(objectCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getMembers");
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
| **userId** | **String**| 用户ID | |
| **objectCode** | **String**| 组织编码 | [optional] |

### Return type

[**List&lt;GetMembers200ResponseInner&gt;**](GetMembers200ResponseInner.md)

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

<a id="getNode"></a>
# **getNode**
> TreeNode getNode(id).execute();

查询节点信息

根据ID查询节点信息

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      TreeNode result = apiInstance.getNode(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getNode");
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
| **id** | **String**|  | |

### Return type

[**TreeNode**](TreeNode.md)

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

<a id="getNodeMembers"></a>
# **getNodeMembers**
> NodeMemberWithPage getNodeMembers(id).relationType(relationType).isDefault(isDefault).displayName(displayName).username(username).mode(mode).pageNum(pageNum).pageSize(pageSize).pageSort(pageSort).execute();

获取成员信息列表

根据组织节点ID获取成员信息列表

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = ""; // String | node id
    String relationType = "relationType_example"; // String | 关联类型，用于区分多重关联
    String isDefault = "isDefault_example"; // String | 是否默认关系 1是，0否
    String displayName = "displayName_example"; // String | 用户显示名
    String username = ""; // String | 用户名，支持模糊搜索（仅前缀）
    String mode = "000"; // String | // mode - 低->高 bit // 第1位：是否获得指针节点所对应的真实结点，1-是，0-否 // 第2位：是否展开WeakNode，即节点中类型不同的节点，1-展开，0-不展开 // 第3位：是否递归地展开节点（不建议）
    Integer pageNum = ; // Integer | 起始页，默认1
    Integer pageSize = ; // Integer | 页大小，默认10
    String pageSort = ""; // String | 排序方式，格式：字段[排序方式]
    try {
      NodeMemberWithPage result = apiInstance.getNodeMembers(id)
            .relationType(relationType)
            .isDefault(isDefault)
            .displayName(displayName)
            .username(username)
            .mode(mode)
            .pageNum(pageNum)
            .pageSize(pageSize)
            .pageSort(pageSort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getNodeMembers");
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
| **id** | **String**| node id | |
| **relationType** | **String**| 关联类型，用于区分多重关联 | [optional] |
| **isDefault** | **String**| 是否默认关系 1是，0否 | [optional] |
| **displayName** | **String**| 用户显示名 | [optional] |
| **username** | **String**| 用户名，支持模糊搜索（仅前缀） | [optional] |
| **mode** | **String**| // mode - 低-&gt;高 bit // 第1位：是否获得指针节点所对应的真实结点，1-是，0-否 // 第2位：是否展开WeakNode，即节点中类型不同的节点，1-展开，0-不展开 // 第3位：是否递归地展开节点（不建议） | [optional] |
| **pageNum** | **Integer**| 起始页，默认1 | [optional] |
| **pageSize** | **Integer**| 页大小，默认10 | [optional] |
| **pageSort** | **String**| 排序方式，格式：字段[排序方式] | [optional] |

### Return type

[**NodeMemberWithPage**](NodeMemberWithPage.md)

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

<a id="getNodeParent"></a>
# **getNodeParent**
> List&lt;TreeNode&gt; getNodeParent(id).execute();

查询父节点



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      List<TreeNode> result = apiInstance.getNodeParent(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getNodeParent");
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
| **id** | **String**|  | |

### Return type

[**List&lt;TreeNode&gt;**](TreeNode.md)

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

<a id="getNodes"></a>
# **getNodes**
> List&lt;TreeNode&gt; getNodes(objectCode).name(name).code(code).tag(tag).timeModifiedFrom(timeModifiedFrom).timeModifiedTo(timeModifiedTo).ids(ids).execute();

查询节点信息列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String objectCode = ""; // String | 组织编码
    String name = "name_example"; // String | 名字，支持前缀搜索
    String code = ""; // String | 编号
    String tag = "tag_example"; // String | 标签
    String timeModifiedFrom = ""; // String | 更新时间起点
    String timeModifiedTo = ""; // String | 更新时间终点，默认至今
    String ids = "ids_example"; // String | id列表，逗号“,”分隔
    try {
      List<TreeNode> result = apiInstance.getNodes(objectCode)
            .name(name)
            .code(code)
            .tag(tag)
            .timeModifiedFrom(timeModifiedFrom)
            .timeModifiedTo(timeModifiedTo)
            .ids(ids)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getNodes");
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
| **objectCode** | **String**| 组织编码 | |
| **name** | **String**| 名字，支持前缀搜索 | [optional] |
| **code** | **String**| 编号 | [optional] |
| **tag** | **String**| 标签 | [optional] |
| **timeModifiedFrom** | **String**| 更新时间起点 | [optional] |
| **timeModifiedTo** | **String**| 更新时间终点，默认至今 | [optional] |
| **ids** | **String**| id列表，逗号“,”分隔 | [optional] |

### Return type

[**List&lt;TreeNode&gt;**](TreeNode.md)

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

<a id="getOrganization"></a>
# **getOrganization**
> List&lt;OrganizationTree&gt; getOrganization(id, code).execute();

获取组织关系基本信息



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = "id_example"; // String | 
    String code = "code_example"; // String | 
    try {
      List<OrganizationTree> result = apiInstance.getOrganization(id, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganization");
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
| **id** | **String**|  | |
| **code** | **String**|  | |

### Return type

[**List&lt;OrganizationTree&gt;**](OrganizationTree.md)

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

<a id="getOrganizations"></a>
# **getOrganizations**
> List&lt;OrganizationTree&gt; getOrganizations().type(type).execute();

获取组织关系列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String type = "1"; // String | 类型：0角色树，1组织树，默认1
    try {
      List<OrganizationTree> result = apiInstance.getOrganizations()
            .type(type)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizations");
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
| **type** | **String**| 类型：0角色树，1组织树，默认1 | [optional] |

### Return type

[**List&lt;OrganizationTree&gt;**](OrganizationTree.md)

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

<a id="updateMember"></a>
# **updateMember**
> CommonRet updateMember(id, contentType).modifyNodeMemberReq(modifyNodeMemberReq).execute();

更新用户节点



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = "用户ID"; // String | 
    String contentType = "application/json"; // String | 
    ModifyNodeMemberReq modifyNodeMemberReq = new ModifyNodeMemberReq(); // ModifyNodeMemberReq | 
    try {
      CommonRet result = apiInstance.updateMember(id, contentType)
            .modifyNodeMemberReq(modifyNodeMemberReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateMember");
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
| **id** | **String**|  | |
| **contentType** | **String**|  | |
| **modifyNodeMemberReq** | [**ModifyNodeMemberReq**](ModifyNodeMemberReq.md)|  | [optional] |

### Return type

[**CommonRet**](CommonRet.md)

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

<a id="updateNode"></a>
# **updateNode**
> CommonRet updateNode(id, contentType).modifyOrganizationNodeReq(modifyOrganizationNodeReq).execute();

编辑节点

 移动节点修改parent_id 

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = "id_example"; // String | 更新树节点
    String contentType = "application/json"; // String | 
    ModifyOrganizationNodeReq modifyOrganizationNodeReq = new ModifyOrganizationNodeReq(); // ModifyOrganizationNodeReq | 
    try {
      CommonRet result = apiInstance.updateNode(id, contentType)
            .modifyOrganizationNodeReq(modifyOrganizationNodeReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateNode");
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
| **id** | **String**| 更新树节点 | |
| **contentType** | **String**|  | |
| **modifyOrganizationNodeReq** | [**ModifyOrganizationNodeReq**](ModifyOrganizationNodeReq.md)|  | [optional] |

### Return type

[**CommonRet**](CommonRet.md)

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

<a id="updateOrganization"></a>
# **updateOrganization**
> CommonRet updateOrganization(id, contentType).modifyOrganizationReq(modifyOrganizationReq).execute();

修改组织关系基本信息



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String id = "id_example"; // String | 
    String contentType = "application/json"; // String | 
    ModifyOrganizationReq modifyOrganizationReq = new ModifyOrganizationReq(); // ModifyOrganizationReq | 
    try {
      CommonRet result = apiInstance.updateOrganization(id, contentType)
            .modifyOrganizationReq(modifyOrganizationReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateOrganization");
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
| **id** | **String**|  | |
| **contentType** | **String**|  | |
| **modifyOrganizationReq** | [**ModifyOrganizationReq**](ModifyOrganizationReq.md)|  | [optional] |

### Return type

[**CommonRet**](CommonRet.md)

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

