/*
 * IDMesh-Dev
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.4.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cn.idmesh.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;

import cn.idmesh.JSON;

/**
 * RefreshAppSecretRetData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefreshAppSecretRetData {
  public static final String SERIALIZED_NAME_APP_SECRET = "appSecret";
  @SerializedName(SERIALIZED_NAME_APP_SECRET)
  private String appSecret;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public RefreshAppSecretRetData() {
  }
   /**
   * 安全码
   * @return appSecret
  **/
  @javax.annotation.Nullable
  public String getAppSecret() {
    return appSecret;
  }


  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

   /**
   * 唯一标识
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshAppSecretRetData refreshAppSecretRetData = (RefreshAppSecretRetData) o;
    return Objects.equals(this.appSecret, refreshAppSecretRetData.appSecret) &&
        Objects.equals(this.id, refreshAppSecretRetData.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appSecret, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshAppSecretRetData {\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("appSecret");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RefreshAppSecretRetData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RefreshAppSecretRetData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefreshAppSecretRetData is not found in the empty JSON string", RefreshAppSecretRetData.openapiRequiredFields.toString()));
        }
      }

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("appSecret") != null && !jsonObj.get("appSecret").isJsonNull()) && !jsonObj.get("appSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appSecret").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefreshAppSecretRetData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefreshAppSecretRetData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefreshAppSecretRetData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefreshAppSecretRetData.class));

       return (TypeAdapter<T>) new TypeAdapter<RefreshAppSecretRetData>() {
           @Override
           public void write(JsonWriter out, RefreshAppSecretRetData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RefreshAppSecretRetData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RefreshAppSecretRetData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RefreshAppSecretRetData
  * @throws IOException if the JSON string is invalid with respect to RefreshAppSecretRetData
  */
  public static RefreshAppSecretRetData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefreshAppSecretRetData.class);
  }

 /**
  * Convert an instance of RefreshAppSecretRetData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

