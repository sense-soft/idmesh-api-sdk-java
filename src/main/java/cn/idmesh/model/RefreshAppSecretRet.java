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
 * RefreshAppSecretRet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefreshAppSecretRet {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private RefreshAppSecretRetData data;

  public RefreshAppSecretRet() {
  }
   /**
   * 操作结果
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public RefreshAppSecretRetData getData() {
    return data;
  }


  public void setData(RefreshAppSecretRetData data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshAppSecretRet refreshAppSecretRet = (RefreshAppSecretRet) o;
    return Objects.equals(this.message, refreshAppSecretRet.message) &&
        Objects.equals(this.data, refreshAppSecretRet.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshAppSecretRet {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RefreshAppSecretRet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RefreshAppSecretRet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RefreshAppSecretRet is not found in the empty JSON string", RefreshAppSecretRet.openapiRequiredFields.toString()));
        }
      }

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        RefreshAppSecretRetData.validateJsonElement(jsonObj.get("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefreshAppSecretRet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefreshAppSecretRet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefreshAppSecretRet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefreshAppSecretRet.class));

       return (TypeAdapter<T>) new TypeAdapter<RefreshAppSecretRet>() {
           @Override
           public void write(JsonWriter out, RefreshAppSecretRet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RefreshAppSecretRet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RefreshAppSecretRet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RefreshAppSecretRet
  * @throws IOException if the JSON string is invalid with respect to RefreshAppSecretRet
  */
  public static RefreshAppSecretRet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefreshAppSecretRet.class);
  }

 /**
  * Convert an instance of RefreshAppSecretRet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

