# StorageApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBucket**](StorageApi.md#deleteBucket) | **DELETE** /v1/buckets/{bucket} | 删除 Bucket |
| [**deleteObject**](StorageApi.md#deleteObject) | **DELETE** /v1/buckets/{bucket}/objects/{key} | 删除 Object |
| [**getBucket**](StorageApi.md#getBucket) | **GET** /v1/buckets/{bucket} | 获取 Bucket 详情 |
| [**getBuckets**](StorageApi.md#getBuckets) | **GET** /v1/buckets | 获取 Bucket 列表 |
| [**getObject**](StorageApi.md#getObject) | **GET** /v1/buckets/{bucket}/objects/{key} | 获取 Object 详情 |
| [**getObjects**](StorageApi.md#getObjects) | **GET** /v1/buckets/{bucket}/objects | 获取 Object 列表 |
| [**saveObject**](StorageApi.md#saveObject) | **POST** /v1/buckets/{bucket}/objects | 创建 Object |


<a id="deleteBucket"></a>
# **deleteBucket**
> Object deleteBucket(bucket).execute();

删除 Bucket

删除bucket会间接删掉bucket下所有object

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucket = "bucket_example"; // String | bucket 名称
    try {
      Object result = apiInstance.deleteBucket(bucket)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#deleteBucket");
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
| **bucket** | **String**| bucket 名称 | |

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

<a id="deleteObject"></a>
# **deleteObject**
> ModelObject deleteObject(bucket, key).keyAsPrefix(keyAsPrefix).execute();

删除 Object



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucket = "bucket_example"; // String | bucket名称
    String key = "key_example"; // String | 键
    String keyAsPrefix = "false"; // String | 将键名称作为前缀执行删除
    try {
      ModelObject result = apiInstance.deleteObject(bucket, key)
            .keyAsPrefix(keyAsPrefix)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#deleteObject");
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
| **bucket** | **String**| bucket名称 | |
| **key** | **String**| 键 | |
| **keyAsPrefix** | **String**| 将键名称作为前缀执行删除 | [optional] |

### Return type

[**ModelObject**](ModelObject.md)

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

<a id="getBucket"></a>
# **getBucket**
> Bucket getBucket(bucket).execute();

获取 Bucket 详情



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucket = "bucket_example"; // String | bucket 名称
    try {
      Bucket result = apiInstance.getBucket(bucket)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getBucket");
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
| **bucket** | **String**| bucket 名称 | |

### Return type

[**Bucket**](Bucket.md)

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

<a id="getBuckets"></a>
# **getBuckets**
> List&lt;Bucket&gt; getBuckets().last(last).limit(limit).execute();

获取 Bucket 列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String last = ""; // String | 最后一个bucket的名字
    Integer limit = ; // Integer | 页大小
    try {
      List<Bucket> result = apiInstance.getBuckets()
            .last(last)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getBuckets");
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
| **last** | **String**| 最后一个bucket的名字 | [optional] |
| **limit** | **Integer**| 页大小 | [optional] |

### Return type

[**List&lt;Bucket&gt;**](Bucket.md)

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

<a id="getObject"></a>
# **getObject**
> ModelObject getObject(bucket, key).execute();

获取 Object 详情



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucket = "bucket_example"; // String | bucket名称
    String key = "key_example"; // String | 键
    try {
      ModelObject result = apiInstance.getObject(bucket, key)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getObject");
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
| **bucket** | **String**| bucket名称 | |
| **key** | **String**| 键 | |

### Return type

[**ModelObject**](ModelObject.md)

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

<a id="getObjects"></a>
# **getObjects**
> List&lt;ModelObject&gt; getObjects(bucket).last(last).limit(limit).execute();

获取 Object 列表



### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucket = "bucket_example"; // String | bucket名称
    String last = ""; // String | 最后一个object的名字
    Integer limit = ; // Integer | 页大小
    try {
      List<ModelObject> result = apiInstance.getObjects(bucket)
            .last(last)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#getObjects");
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
| **bucket** | **String**| bucket名称 | |
| **last** | **String**| 最后一个object的名字 | [optional] |
| **limit** | **Integer**| 页大小 | [optional] |

### Return type

[**List&lt;ModelObject&gt;**](ModelObject.md)

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

<a id="saveObject"></a>
# **saveObject**
> Object saveObject(bucket).keyValuePair(keyValuePair).execute();

创建 Object

- 如果path中的bucket没有创建，会默认创建 - 如果key已经存在，会更新原有的值 - value 大小最大为 1M 字节 - bucket 最长为 255 个字节

### Example
```java
// Import classes:
import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.Configuration;
import com.idmesh.models.*;
import com.idmesh.api.StorageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = new ApiClient("basePath", "ak", "sk");

    StorageApi apiInstance = new StorageApi(defaultClient);
    String bucket = "bucket_example"; // String | bucket名称
    KeyValuePair keyValuePair = new KeyValuePair(); // KeyValuePair | 
    try {
      Object result = apiInstance.saveObject(bucket)
            .keyValuePair(keyValuePair)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorageApi#saveObject");
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
| **bucket** | **String**| bucket名称 | |
| **keyValuePair** | [**KeyValuePair**](KeyValuePair.md)|  | [optional] |

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

