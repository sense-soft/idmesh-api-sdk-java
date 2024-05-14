# UserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](UserApi.md#callList) | **GET** /v1/users | 查询用户列表 |
| [**create**](UserApi.md#create) | **POST** /v1/users | 创建用户 |
| [**createStoreCredential**](UserApi.md#createStoreCredential) | **POST** /v1/user-stored-credentials | 创建用户存储凭证 |
| [**delete**](UserApi.md#delete) | **DELETE** /v1/users/{id} | 删除用户 |
| [**get**](UserApi.md#get) | **GET** /v1/users/{id} | 查询用户详情 |
| [**getStoredCredentials**](UserApi.md#getStoredCredentials) | **GET** /v1/user-stored-credentials | 查询用户存储凭证列表 |
| [**modify**](UserApi.md#modify) | **PATCH** /v1/users/{id} | 编辑用户 |


<a id="callList"></a>
# **callList**
> UserWithPage callList().pageSize(pageSize).pageNum(pageNum).searchType(searchType).keyword(keyword).timeModifiedFrom(timeModifiedFrom).timeModifiedTo(timeModifiedTo).execute();

查询用户列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    UserApi apiInstance = new UserApi(defaultClient);
    Integer pageSize = 10; // Integer | 
    Integer pageNum = 1; // Integer | 
    String searchType = ""; // String | search_type查询类型：generic（全文搜索）、advanced（高级搜索）、不填（基础搜索） 默认基础搜索：http://xxx.idmesh.site/v1/user?username=xxx&display_name=xxx...... 全文检索：http://xxx.idmesh.site/v1/user?keyword=xxx&username[eq]=xxx...... 高级检索：http://xxx.idmesh.site/v1/user?username[eq]=xxx&time_created[gt]=xxx&keyword=xxx@163.com...... eq：等于（equal） ne：不等于（not equal） gt：大于（greater than） lt：小于（less than） gte：大于等于（greater than or equal to） lte：小于等于（less than or equal to） in：在给定范围内（in a given range） like：模糊匹配，包含 notlike：不匹配，不包含 orderby：排序的顺序（order by） 
    String keyword = ""; // String | 检索值
    String timeModifiedFrom = "timeModifiedFrom_example"; // String | 开始时间
    String timeModifiedTo = "timeModifiedTo_example"; // String | 结束时间
    try {
      UserWithPage result = apiInstance.callList()
            .pageSize(pageSize)
            .pageNum(pageNum)
            .searchType(searchType)
            .keyword(keyword)
            .timeModifiedFrom(timeModifiedFrom)
            .timeModifiedTo(timeModifiedTo)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#callList");
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
| **pageSize** | **Integer**|  | [optional] |
| **pageNum** | **Integer**|  | [optional] |
| **searchType** | **String**| search_type查询类型：generic（全文搜索）、advanced（高级搜索）、不填（基础搜索） 默认基础搜索：http://xxx.idmesh.site/v1/user?username&#x3D;xxx&amp;display_name&#x3D;xxx...... 全文检索：http://xxx.idmesh.site/v1/user?keyword&#x3D;xxx&amp;username[eq]&#x3D;xxx...... 高级检索：http://xxx.idmesh.site/v1/user?username[eq]&#x3D;xxx&amp;time_created[gt]&#x3D;xxx&amp;keyword&#x3D;xxx@163.com...... eq：等于（equal） ne：不等于（not equal） gt：大于（greater than） lt：小于（less than） gte：大于等于（greater than or equal to） lte：小于等于（less than or equal to） in：在给定范围内（in a given range） like：模糊匹配，包含 notlike：不匹配，不包含 orderby：排序的顺序（order by）  | [optional] |
| **keyword** | **String**| 检索值 | [optional] |
| **timeModifiedFrom** | **String**| 开始时间 | [optional] |
| **timeModifiedTo** | **String**| 结束时间 | [optional] |

### Return type

[**UserWithPage**](UserWithPage.md)

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

<a id="create"></a>
# **create**
> CommonRet create(contentType).createUserReq(createUserReq).execute();

创建用户



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    UserApi apiInstance = new UserApi(defaultClient);
    String contentType = "application/json"; // String | 
    CreateUserReq createUserReq = new CreateUserReq(); // CreateUserReq | 
    try {
      CommonRet result = apiInstance.create(contentType)
            .createUserReq(createUserReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#create");
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
| **createUserReq** | [**CreateUserReq**](CreateUserReq.md)|  | [optional] |

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

<a id="createStoreCredential"></a>
# **createStoreCredential**
> CommonRet createStoreCredential(contentType).createUserStoredCredentialReq(createUserStoredCredentialReq).execute();

创建用户存储凭证



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    UserApi apiInstance = new UserApi(defaultClient);
    String contentType = "application/json"; // String | 
    CreateUserStoredCredentialReq createUserStoredCredentialReq = new CreateUserStoredCredentialReq(); // CreateUserStoredCredentialReq | 
    try {
      CommonRet result = apiInstance.createStoreCredential(contentType)
            .createUserStoredCredentialReq(createUserStoredCredentialReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createStoreCredential");
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
| **createUserStoredCredentialReq** | [**CreateUserStoredCredentialReq**](CreateUserStoredCredentialReq.md)|  | [optional] |

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

<a id="delete"></a>
# **delete**
> CommonRet delete(id, contentType).execute();

删除用户



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | 
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      CommonRet result = apiInstance.delete(id, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#delete");
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

<a id="get"></a>
# **get**
> UserDetailRet get(id).execute();

查询用户详情



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UserDetailRet result = apiInstance.get(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#get");
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

[**UserDetailRet**](UserDetailRet.md)

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

<a id="getStoredCredentials"></a>
# **getStoredCredentials**
> UserStoredCredentialWithPage getStoredCredentials(contentType).userId(userId).providerCode(providerCode).idpConfigId(idpConfigId).id1(id1).id2(id2).metadata(metadata).status(status).username(username).displayName(displayName).pageSize(pageSize).pageNum(pageNum).execute();

查询用户存储凭证列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    UserApi apiInstance = new UserApi(defaultClient);
    String contentType = "application/x-www-form-urlencoded"; // String | 
    Integer userId = ; // Integer | 用户id标识
    String providerCode = ""; // String | 社会化登录提供者的code
    Integer idpConfigId = ; // Integer | 社会化登录配置的ID
    String id1 = ""; // String | 社会化身份标识1，约定此字段保存用户唯一标识，如openid
    String id2 = ""; // String | 社会化身份标识2，如unionid
    String metadata = ""; // String | 更多社会化身份标识
    String status = ""; // String | 状态
    String username = "username_example"; // String | 用户名
    String displayName = "displayName_example"; // String | 显示名
    Integer pageSize = ; // Integer | 
    Integer pageNum = ; // Integer | 
    try {
      UserStoredCredentialWithPage result = apiInstance.getStoredCredentials(contentType)
            .userId(userId)
            .providerCode(providerCode)
            .idpConfigId(idpConfigId)
            .id1(id1)
            .id2(id2)
            .metadata(metadata)
            .status(status)
            .username(username)
            .displayName(displayName)
            .pageSize(pageSize)
            .pageNum(pageNum)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getStoredCredentials");
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
| **userId** | **Integer**| 用户id标识 | [optional] |
| **providerCode** | **String**| 社会化登录提供者的code | [optional] |
| **idpConfigId** | **Integer**| 社会化登录配置的ID | [optional] |
| **id1** | **String**| 社会化身份标识1，约定此字段保存用户唯一标识，如openid | [optional] |
| **id2** | **String**| 社会化身份标识2，如unionid | [optional] |
| **metadata** | **String**| 更多社会化身份标识 | [optional] |
| **status** | **String**| 状态 | [optional] |
| **username** | **String**| 用户名 | [optional] |
| **displayName** | **String**| 显示名 | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **pageNum** | **Integer**|  | [optional] |

### Return type

[**UserStoredCredentialWithPage**](UserStoredCredentialWithPage.md)

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

<a id="modify"></a>
# **modify**
> CommonRet modify(id, contentType).modifyUserReq(modifyUserReq).execute();

编辑用户



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | 
    String contentType = "application/json"; // String | 
    ModifyUserReq modifyUserReq = new ModifyUserReq(); // ModifyUserReq | 
    try {
      CommonRet result = apiInstance.modify(id, contentType)
            .modifyUserReq(modifyUserReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#modify");
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
| **modifyUserReq** | [**ModifyUserReq**](ModifyUserReq.md)|  | [optional] |

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

