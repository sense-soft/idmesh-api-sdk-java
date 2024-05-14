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


package com.idmesh.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.idmesh.JSON;

/**
 * 动态的配置字段
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModifyAuthConfigReqConfigFields {
  public static final String SERIALIZED_NAME_APP_ID = "AppId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APP_SECRET = "AppSecret";
  @SerializedName(SERIALIZED_NAME_APP_SECRET)
  private String appSecret;

  public ModifyAuthConfigReqConfigFields() {
  }
   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nonnull
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }

   /**
   * Get appSecret
   * @return appSecret
  **/
  @javax.annotation.Nonnull
  public String getAppSecret() {
    return appSecret;
  }


  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyAuthConfigReqConfigFields modifyAuthConfigReqConfigFields = (ModifyAuthConfigReqConfigFields) o;
    return Objects.equals(this.appId, modifyAuthConfigReqConfigFields.appId) &&
        Objects.equals(this.appSecret, modifyAuthConfigReqConfigFields.appSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAuthConfigReqConfigFields {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
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
    openapiFields.add("AppId");
    openapiFields.add("AppSecret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AppId");
    openapiRequiredFields.add("AppSecret");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModifyAuthConfigReqConfigFields
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModifyAuthConfigReqConfigFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyAuthConfigReqConfigFields is not found in the empty JSON string", ModifyAuthConfigReqConfigFields.openapiRequiredFields.toString()));
        }
      }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModifyAuthConfigReqConfigFields.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("AppId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AppId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AppId").toString()));
      }
      if (!jsonObj.get("AppSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AppSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AppSecret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyAuthConfigReqConfigFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyAuthConfigReqConfigFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyAuthConfigReqConfigFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyAuthConfigReqConfigFields.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyAuthConfigReqConfigFields>() {
           @Override
           public void write(JsonWriter out, ModifyAuthConfigReqConfigFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyAuthConfigReqConfigFields read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModifyAuthConfigReqConfigFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModifyAuthConfigReqConfigFields
  * @throws IOException if the JSON string is invalid with respect to ModifyAuthConfigReqConfigFields
  */
  public static ModifyAuthConfigReqConfigFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyAuthConfigReqConfigFields.class);
  }

 /**
  * Convert an instance of ModifyAuthConfigReqConfigFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

