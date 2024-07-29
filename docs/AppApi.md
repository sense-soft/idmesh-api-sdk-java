# AppApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callList**](AppApi.md#callList) | **GET** /v1/applications | 查询应用列表 |
| [**create**](AppApi.md#create) | **POST** /v1/applications | 创建应用 |
| [**createAccount**](AppApi.md#createAccount) | **POST** /v1/applications/{id}/accounts | 创建应用子账号 |
| [**createIDP**](AppApi.md#createIDP) | **POST** /v1/applications/{id}/idp | 创建应用认证源 |
| [**createMFA**](AppApi.md#createMFA) | **POST** /v1/applications/{id}/mfa | 启用应用多因素认证配置 |
| [**createSecrets**](AppApi.md#createSecrets) | **POST** /v1/applications/{id}/secrets | 刷新应用安全码 |
| [**delete**](AppApi.md#delete) | **DELETE** /v1/applications/{id} | 删除应用 |
| [**deleteAccount**](AppApi.md#deleteAccount) | **DELETE** /v1/applications/{app_id}/accounts/{id} | 删除应用子账号 |
| [**deleteIDPConfig**](AppApi.md#deleteIDPConfig) | **DELETE** /v1/applications/{app_id}/idp/{config_id} | 删除应用认证源 |
| [**deleteMFA**](AppApi.md#deleteMFA) | **DELETE** /v1/applications/{app_id}/mfa/{config_id} | 禁用应用多因素认证配置 |
| [**disable**](AppApi.md#disable) | **POST** /v1/applications/{id}/disable | 禁用应用 |
| [**disableAccount**](AppApi.md#disableAccount) | **POST** /v1/applications/{app_id}/accounts/{id}/disable | 禁用应用子账号 |
| [**disableProtocol**](AppApi.md#disableProtocol) | **POST** /v1/applications/{app_id}/protocols/{protocol_type}/disable | 禁用应用认证协议 |
| [**disableSSO**](AppApi.md#disableSSO) | **POST** /v1/applications/{id}/sso/disable | 禁用应用单点登录 |
| [**enable**](AppApi.md#enable) | **POST** /v1/applications/{id}/enable | 启用应用 |
| [**enableAccount**](AppApi.md#enableAccount) | **POST** /v1/applications/{app_id}/accounts/{id}/enable | 启用应用子账号 |
| [**enableProtocol**](AppApi.md#enableProtocol) | **POST** /v1/applications/{app_id}/protocols/{protocol_type}/enable | 启用应用认证协议 |
| [**enableSSO**](AppApi.md#enableSSO) | **POST** /v1/applications/{id}/sso/enable | 启用应用单点登录 |
| [**get**](AppApi.md#get) | **GET** /v1/applications/{id} | 按 ID 查询应用 |
| [**getAccount**](AppApi.md#getAccount) | **GET** /v1/applications/{app_id}/accounts/{id} | 按 ID 查询应用子账号 |
| [**getAccounts**](AppApi.md#getAccounts) | **GET** /v1/application-accounts | 按条件查询应用子账号列表 |
| [**getAccountsByApp**](AppApi.md#getAccountsByApp) | **GET** /v1/applications/{app_id}/accounts | 按 APP ID 查询应用子账号列表 |
| [**getByDomain**](AppApi.md#getByDomain) | **GET** /v1/application | 按条件查询应用 |
| [**getConfig**](AppApi.md#getConfig) | **GET** /v1/applications/{id}/configs | 查询应用配置信息 |
| [**getProtocol**](AppApi.md#getProtocol) | **GET** /v1/applications/{app_id}/protocols/{protocol_type} | 查询应用认证协议 |
| [**getProtocols**](AppApi.md#getProtocols) | **GET** /v1/applications/{id}/protocols | 查询应用认证协议列表 |
| [**modify**](AppApi.md#modify) | **PATCH** /v1/applications/{id} | 更新应用基本信息 |
| [**modifyAccount**](AppApi.md#modifyAccount) | **PUT** /v1/applications/{app_id}/accounts/{id} | 更新应用子账号 |
| [**modifyConfig**](AppApi.md#modifyConfig) | **PATCH** /v1/applications/{id}/configs | 更新应用配置 |
| [**modifyProtocol**](AppApi.md#modifyProtocol) | **PUT** /v1/applications/{app_id}/protocols/{protocol_type} | 更新应用认证协议 |


<a id="callList"></a>
# **callList**
> AppWithPage callList().name(name).type(type).pageSort(pageSort).types(types).execute();

查询应用列表



### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| 应用名称 | [optional] |
| **type** | **String**| 应用类型 | [optional] |
| **pageSort** | **String**| 排序，格式：字段名[顺序] | [optional] |
| **types** | **String**| 应用类型列表，逗号分隔 | [optional] |

### Return type

[**AppWithPage**](AppWithPage.md)

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
> CommonRet create(contentType).createAppReq(createAppReq).execute();

创建应用



### Example
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
    String contentType = "application/json"; // String | 
    CreateAppReq createAppReq = new CreateAppReq(); // CreateAppReq | 
    try {
      CommonRet result = apiInstance.create(contentType)
            .createAppReq(createAppReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#create");
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
| **createAppReq** | [**CreateAppReq**](CreateAppReq.md)|  | [optional] |

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

<a id="createAccount"></a>
# **createAccount**
> CreateAccount200Response createAccount(id, contentType).createAccountRequest(createAccountRequest).execute();

创建应用子账号



### Example
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
    String id = ""; // String | 应用id
    String contentType = "application/json"; // String | 
    CreateAccountRequest createAccountRequest = new CreateAccountRequest(); // CreateAccountRequest | 
    try {
      CreateAccount200Response result = apiInstance.createAccount(id, contentType)
            .createAccountRequest(createAccountRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#createAccount");
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
| **id** | **String**| 应用id | |
| **contentType** | **String**|  | |
| **createAccountRequest** | [**CreateAccountRequest**](CreateAccountRequest.md)|  | [optional] |

### Return type

[**CreateAccount200Response**](CreateAccount200Response.md)

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

<a id="createIDP"></a>
# **createIDP**
> Object createIDP(id, contentType).createAppIDPReq(createAppIDPReq).execute();

创建应用认证源



### Example
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
    String id = "id_example"; // String | 应用id
    String contentType = "application/json"; // String | 
    CreateAppIDPReq createAppIDPReq = new CreateAppIDPReq(); // CreateAppIDPReq | 
    try {
      Object result = apiInstance.createIDP(id, contentType)
            .createAppIDPReq(createAppIDPReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#createIDP");
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
| **id** | **String**| 应用id | |
| **contentType** | **String**|  | |
| **createAppIDPReq** | [**CreateAppIDPReq**](CreateAppIDPReq.md)|  | [optional] |

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

<a id="createMFA"></a>
# **createMFA**
> Object createMFA(id, contentType).emptyObject(emptyObject).execute();

启用应用多因素认证配置



### Example
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
    String id = "id_example"; // String | 应用id
    String contentType = "application/json"; // String | 
    EmptyObject emptyObject = new EmptyObject(); // EmptyObject | 
    try {
      Object result = apiInstance.createMFA(id, contentType)
            .emptyObject(emptyObject)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#createMFA");
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
| **id** | **String**| 应用id | |
| **contentType** | **String**|  | |
| **emptyObject** | [**EmptyObject**](EmptyObject.md)|  | [optional] |

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

<a id="createSecrets"></a>
# **createSecrets**
> RefreshAppSecretRet createSecrets(id, contentType).execute();

刷新应用安全码



### Example
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
    String id = "id_example"; // String | 
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      RefreshAppSecretRet result = apiInstance.createSecrets(id, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#createSecrets");
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

[**RefreshAppSecretRet**](RefreshAppSecretRet.md)

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

<a id="delete"></a>
# **delete**
> DeleteAppRet delete(id, contentType).execute();

删除应用



### Example
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
    String id = "id_example"; // String | 
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      DeleteAppRet result = apiInstance.delete(id, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#delete");
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

[**DeleteAppRet**](DeleteAppRet.md)

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

<a id="deleteAccount"></a>
# **deleteAccount**
> Object deleteAccount(appId, id, contentType).execute();

删除应用子账号



### Example
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
    String appId = "appId_example"; // String | 应用id
    String id = "id_example"; // String | 子账号id
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      Object result = apiInstance.deleteAccount(appId, id, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#deleteAccount");
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
| **appId** | **String**| 应用id | |
| **id** | **String**| 子账号id | |
| **contentType** | **String**|  | |

### Return type

**Object**

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

<a id="deleteIDPConfig"></a>
# **deleteIDPConfig**
> Object deleteIDPConfig(appId, configId, contentType).execute();

删除应用认证源



### Example
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
    String appId = "appId_example"; // String | 应用id
    String configId = "configId_example"; // String | 
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      Object result = apiInstance.deleteIDPConfig(appId, configId, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#deleteIDPConfig");
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
| **appId** | **String**| 应用id | |
| **configId** | **String**|  | |
| **contentType** | **String**|  | |

### Return type

**Object**

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

<a id="deleteMFA"></a>
# **deleteMFA**
> Object deleteMFA(appId, configId, contentType).execute();

禁用应用多因素认证配置



### Example
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
    String appId = "appId_example"; // String | 应用id
    String configId = "configId_example"; // String | 
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      Object result = apiInstance.deleteMFA(appId, configId, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#deleteMFA");
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
| **appId** | **String**| 应用id | |
| **configId** | **String**|  | |
| **contentType** | **String**|  | |

### Return type

**Object**

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

<a id="disable"></a>
# **disable**
> Disable200Response disable(id, contentType).execute();

禁用应用



### Example
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
    String id = "id_example"; // String | 应用标识
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      Disable200Response result = apiInstance.disable(id, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#disable");
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
| **id** | **String**| 应用标识 | |
| **contentType** | **String**|  | |

### Return type

[**Disable200Response**](Disable200Response.md)

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

<a id="disableAccount"></a>
# **disableAccount**
> Object disableAccount(appId, id, contentType).execute();

禁用应用子账号



### Example
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
    String appId = "appId_example"; // String | 应用id
    String id = "id_example"; // String | 子账号id
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      Object result = apiInstance.disableAccount(appId, id, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#disableAccount");
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
| **appId** | **String**| 应用id | |
| **id** | **String**| 子账号id | |
| **contentType** | **String**|  | |

### Return type

**Object**

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

<a id="disableProtocol"></a>
# **disableProtocol**
> Object disableProtocol(appId, protocolType, contentType).execute();

禁用应用认证协议



### Example
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
    String appId = "appId_example"; // String | 应用 id
    String protocolType = "protocolType_example"; // String | 协议名称，如 oidc
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      Object result = apiInstance.disableProtocol(appId, protocolType, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#disableProtocol");
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
| **appId** | **String**| 应用 id | |
| **protocolType** | **String**| 协议名称，如 oidc | |
| **contentType** | **String**|  | |

### Return type

**Object**

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

<a id="disableSSO"></a>
# **disableSSO**
> Object disableSSO(id).execute();

禁用应用单点登录



### Example
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
    String id = "id_example"; // String | 应用标识
    try {
      Object result = apiInstance.disableSSO(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#disableSSO");
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
| **id** | **String**| 应用标识 | |

### Return type

**Object**

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

<a id="enable"></a>
# **enable**
> EnableAppRet enable(id, contentType).execute();

启用应用



### Example
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
    String id = "id_example"; // String | 应用标识
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      EnableAppRet result = apiInstance.enable(id, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#enable");
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
| **id** | **String**| 应用标识 | |
| **contentType** | **String**|  | |

### Return type

[**EnableAppRet**](EnableAppRet.md)

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

<a id="enableAccount"></a>
# **enableAccount**
> Object enableAccount(appId, id, id2, contentType).execute();

启用应用子账号



### Example
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
    String appId = "appId_example"; // String | 应用id
    String id = "id_example"; // String | 子账号id
    String id2 = "id_example"; // String | 
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      Object result = apiInstance.enableAccount(appId, id, id2, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#enableAccount");
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
| **appId** | **String**| 应用id | |
| **id** | **String**| 子账号id | |
| **id2** | **String**|  | |
| **contentType** | **String**|  | |

### Return type

**Object**

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

<a id="enableProtocol"></a>
# **enableProtocol**
> EnableAppProtocolRet enableProtocol(appId, protocolType, contentType).execute();

启用应用认证协议



### Example
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
    String appId = "appId_example"; // String | 应用 id
    String protocolType = "oidc"; // String | 协议名称，如 oidc
    String contentType = "application/x-www-form-urlencoded"; // String | 
    try {
      EnableAppProtocolRet result = apiInstance.enableProtocol(appId, protocolType, contentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#enableProtocol");
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
| **appId** | **String**| 应用 id | |
| **protocolType** | **String**| 协议名称，如 oidc | |
| **contentType** | **String**|  | |

### Return type

[**EnableAppProtocolRet**](EnableAppProtocolRet.md)

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

<a id="enableSSO"></a>
# **enableSSO**
> Object enableSSO(id).execute();

启用应用单点登录



### Example
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
    String id = "id_example"; // String | 应用标识
    try {
      Object result = apiInstance.enableSSO(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#enableSSO");
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
| **id** | **String**| 应用标识 | |

### Return type

**Object**

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

<a id="get"></a>
# **get**
> App get(id).execute();

按 ID 查询应用



### Example
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
    String id = "11123321123321123321123"; // String | 唯一标识
    try {
      App result = apiInstance.get(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#get");
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
| **id** | **String**| 唯一标识 | |

### Return type

[**App**](App.md)

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

<a id="getAccount"></a>
# **getAccount**
> AppSubAccount getAccount(appId, id).execute();

按 ID 查询应用子账号



### Example
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
    String appId = ""; // String | 应用id
    String id = "id_example"; // String | 子账号id
    try {
      AppSubAccount result = apiInstance.getAccount(appId, id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getAccount");
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
| **appId** | **String**| 应用id | |
| **id** | **String**| 子账号id | |

### Return type

[**AppSubAccount**](AppSubAccount.md)

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

<a id="getAccounts"></a>
# **getAccounts**
> GetAccounts200Response getAccounts().appId(appId).userId(userId).accStatus(accStatus).accName(accName).pageNum(pageNum).pageSize(pageSize).pageSort(pageSort).accNameEq(accNameEq).timeModifiedGt(timeModifiedGt).timeModifiedLt(timeModifiedLt).accType(accType).orphanedOnly(orphanedOnly).linkedUserId(linkedUserId).hideSelf(hideSelf).execute();

按条件查询应用子账号列表



### Example
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
    String appId = "appId_example"; // String | 应用id
    String userId = "userId_example"; // String | 用户id
    String accStatus = "accStatus_example"; // String | 账号状态 1-活跃 0-冻结
    String accName = ""; // String | 账号名称模糊查询
    Integer pageNum = 56; // Integer | 页数
    Integer pageSize = 56; // Integer | 页大小
    String pageSort = "time_created[asc]"; // String | 排序字段
    String accNameEq = "accNameEq_example"; // String | 账号名称精确查询
    String timeModifiedGt = "2022-12-01T14%3A03%3A57%2B08%3A00"; // String | 账号最近修改时间大于，rfc3339格式，需要进行 url encode
    String timeModifiedLt = "2022-12-01T14%3A03%3A57%2B08%3A00"; // String | 账号最近修改时间小于，rfc3339格式，需要进行 url encode
    String accType = "personal"; // String | 账号类型
    String orphanedOnly = "true"; // String | 只查询无归属账号
    String linkedUserId = "linkedUserId_example"; // String | 关联用户id
    String hideSelf = "true"; // String | 隐藏当前调用者的账号信息
    try {
      GetAccounts200Response result = apiInstance.getAccounts()
            .appId(appId)
            .userId(userId)
            .accStatus(accStatus)
            .accName(accName)
            .pageNum(pageNum)
            .pageSize(pageSize)
            .pageSort(pageSort)
            .accNameEq(accNameEq)
            .timeModifiedGt(timeModifiedGt)
            .timeModifiedLt(timeModifiedLt)
            .accType(accType)
            .orphanedOnly(orphanedOnly)
            .linkedUserId(linkedUserId)
            .hideSelf(hideSelf)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getAccounts");
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
| **appId** | **String**| 应用id | [optional] |
| **userId** | **String**| 用户id | [optional] |
| **accStatus** | **String**| 账号状态 1-活跃 0-冻结 | [optional] |
| **accName** | **String**| 账号名称模糊查询 | [optional] |
| **pageNum** | **Integer**| 页数 | [optional] |
| **pageSize** | **Integer**| 页大小 | [optional] |
| **pageSort** | **String**| 排序字段 | [optional] |
| **accNameEq** | **String**| 账号名称精确查询 | [optional] |
| **timeModifiedGt** | **String**| 账号最近修改时间大于，rfc3339格式，需要进行 url encode | [optional] |
| **timeModifiedLt** | **String**| 账号最近修改时间小于，rfc3339格式，需要进行 url encode | [optional] |
| **accType** | **String**| 账号类型 | [optional] |
| **orphanedOnly** | **String**| 只查询无归属账号 | [optional] |
| **linkedUserId** | **String**| 关联用户id | [optional] |
| **hideSelf** | **String**| 隐藏当前调用者的账号信息 | [optional] |

### Return type

[**GetAccounts200Response**](GetAccounts200Response.md)

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

<a id="getAccountsByApp"></a>
# **getAccountsByApp**
> AppSubAccountWithPage getAccountsByApp(appId).userId(userId).accStatus(accStatus).accName(accName).pageNum(pageNum).pageSize(pageSize).pageSort(pageSort).execute();

按 APP ID 查询应用子账号列表



### Example
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
    String appId = "appId_example"; // String | 应用id
    String userId = "userId_example"; // String | 用户id
    String accStatus = "accStatus_example"; // String | 账号状态 1-活跃 0-冻结
    String accName = ""; // String | 账号名称
    Integer pageNum = 56; // Integer | 页数
    Integer pageSize = 56; // Integer | 页大小
    String pageSort = "time_created[asc]"; // String | 排序字段
    try {
      AppSubAccountWithPage result = apiInstance.getAccountsByApp(appId)
            .userId(userId)
            .accStatus(accStatus)
            .accName(accName)
            .pageNum(pageNum)
            .pageSize(pageSize)
            .pageSort(pageSort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getAccountsByApp");
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
| **appId** | **String**| 应用id | |
| **userId** | **String**| 用户id | [optional] |
| **accStatus** | **String**| 账号状态 1-活跃 0-冻结 | [optional] |
| **accName** | **String**| 账号名称 | [optional] |
| **pageNum** | **Integer**| 页数 | [optional] |
| **pageSize** | **Integer**| 页大小 | [optional] |
| **pageSort** | **String**| 排序字段 | [optional] |

### Return type

[**AppSubAccountWithPage**](AppSubAccountWithPage.md)

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

<a id="getByDomain"></a>
# **getByDomain**
> App getByDomain().domain(domain).domainSn(domainSn).execute();

按条件查询应用



### Example
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
    String domain = "sense"; // String | 域名
    String domainSn = "domainSn_example"; // String | 域名简写
    try {
      App result = apiInstance.getByDomain()
            .domain(domain)
            .domainSn(domainSn)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getByDomain");
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
| **domain** | **String**| 域名 | [optional] |
| **domainSn** | **String**| 域名简写 | [optional] |

### Return type

[**App**](App.md)

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

<a id="getConfig"></a>
# **getConfig**
> AppConfigRet getConfig(id).execute();

查询应用配置信息



### Example
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
    String id = "id_example"; // String | 应用ID
    try {
      AppConfigRet result = apiInstance.getConfig(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getConfig");
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
| **id** | **String**| 应用ID | |

### Return type

[**AppConfigRet**](AppConfigRet.md)

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

<a id="getProtocol"></a>
# **getProtocol**
> Object getProtocol(appId, protocolType).execute();

查询应用认证协议



### Example
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
    String appId = "appId_example"; // String | 应用id
    String protocolType = "protocolType_example"; // String | 单点类型，cas、oauth2、saml、oidc、sxp
    try {
      Object result = apiInstance.getProtocol(appId, protocolType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getProtocol");
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
| **appId** | **String**| 应用id | |
| **protocolType** | **String**| 单点类型，cas、oauth2、saml、oidc、sxp | |

### Return type

**Object**

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

<a id="getProtocols"></a>
# **getProtocols**
> List&lt;Object&gt; getProtocols(id).status(status).execute();

查询应用认证协议列表



### Example
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
    String id = "id_example"; // String | 应用唯一标识ID
    String status = "1"; // String | 启用状态 1, 0
    try {
      List<Object> result = apiInstance.getProtocols(id)
            .status(status)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#getProtocols");
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
| **id** | **String**| 应用唯一标识ID | |
| **status** | **String**| 启用状态 1, 0 | [optional] |

### Return type

**List&lt;Object&gt;**

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
> ModifyAppRet modify(id, contentType).modifyAppReq(modifyAppReq).execute();

更新应用基本信息



### Example
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
    String id = "id_example"; // String | 
    String contentType = "application/json"; // String | 
    ModifyAppReq modifyAppReq = new ModifyAppReq(); // ModifyAppReq | 
    try {
      ModifyAppRet result = apiInstance.modify(id, contentType)
            .modifyAppReq(modifyAppReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#modify");
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
| **modifyAppReq** | [**ModifyAppReq**](ModifyAppReq.md)|  | [optional] |

### Return type

[**ModifyAppRet**](ModifyAppRet.md)

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

<a id="modifyAccount"></a>
# **modifyAccount**
> CreateAccount200Response modifyAccount(appId, id, contentType).modifyAccountRequest(modifyAccountRequest).execute();

更新应用子账号



### Example
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
    String appId = "appId_example"; // String | 应用id
    String id = "id_example"; // String | 子账号id
    String contentType = "application/json"; // String | 
    ModifyAccountRequest modifyAccountRequest = new ModifyAccountRequest(); // ModifyAccountRequest | 
    try {
      CreateAccount200Response result = apiInstance.modifyAccount(appId, id, contentType)
            .modifyAccountRequest(modifyAccountRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#modifyAccount");
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
| **appId** | **String**| 应用id | |
| **id** | **String**| 子账号id | |
| **contentType** | **String**|  | |
| **modifyAccountRequest** | [**ModifyAccountRequest**](ModifyAccountRequest.md)|  | [optional] |

### Return type

[**CreateAccount200Response**](CreateAccount200Response.md)

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

<a id="modifyConfig"></a>
# **modifyConfig**
> ModifyAppConfigRet modifyConfig(id, contentType).modifyAppConfigReq(modifyAppConfigReq).execute();

更新应用配置



### Example
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
    String id = "id_example"; // String | 
    String contentType = "application/json"; // String | 
    ModifyAppConfigReq modifyAppConfigReq = new ModifyAppConfigReq(); // ModifyAppConfigReq | 
    try {
      ModifyAppConfigRet result = apiInstance.modifyConfig(id, contentType)
            .modifyAppConfigReq(modifyAppConfigReq)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#modifyConfig");
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
| **modifyAppConfigReq** | [**ModifyAppConfigReq**](ModifyAppConfigReq.md)|  | [optional] |

### Return type

[**ModifyAppConfigRet**](ModifyAppConfigRet.md)

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

<a id="modifyProtocol"></a>
# **modifyProtocol**
> Object modifyProtocol(appId, protocolType, contentType).modifyAppProtocol(modifyAppProtocol).execute();

更新应用认证协议

 具体入参参考：[https://thoughts.teambition.com/workspaces/607401bc94422600473bb8a7/docs/62207129fb49bf000106a046](https://thoughts.teambition.com/workspaces/607401bc94422600473bb8a7/docs/62207129fb49bf000106a046) 

### Example
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
    String appId = "appId_example"; // String | 应用id
    String protocolType = "protocolType_example"; // String | 单点类型，cas、oauth2、saml、oidc、sxp
    String contentType = "application/json"; // String | 
    ModifyAppProtocol modifyAppProtocol = new ModifyAppProtocol(); // ModifyAppProtocol | 
    try {
      Object result = apiInstance.modifyProtocol(appId, protocolType, contentType)
            .modifyAppProtocol(modifyAppProtocol)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppApi#modifyProtocol");
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
| **appId** | **String**| 应用id | |
| **protocolType** | **String**| 单点类型，cas、oauth2、saml、oidc、sxp | |
| **contentType** | **String**|  | |
| **modifyAppProtocol** | [**ModifyAppProtocol**](ModifyAppProtocol.md)|  | [optional] |

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

