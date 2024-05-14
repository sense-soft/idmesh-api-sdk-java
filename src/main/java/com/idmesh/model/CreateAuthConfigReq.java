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
import com.idmesh.model.CreateAuthConfigReqConfigFields;
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
 * CreateAuthConfigReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAuthConfigReq {
  public static final String SERIALIZED_NAME_AUTH_METHOD = "auth_method";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD)
  private String authMethod;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PROVIDER_CODE = "provider_code";
  @SerializedName(SERIALIZED_NAME_PROVIDER_CODE)
  private String providerCode;

  public static final String SERIALIZED_NAME_CONFIG_FIELDS = "config_fields";
  @SerializedName(SERIALIZED_NAME_CONFIG_FIELDS)
  private CreateAuthConfigReqConfigFields configFields;

  public CreateAuthConfigReq() {
  }
   /**
   * 认证方式代码（auth_methods中的code）
   * @return authMethod
  **/
  @javax.annotation.Nonnull
  public String getAuthMethod() {
    return authMethod;
  }


  public void setAuthMethod(String authMethod) {
    this.authMethod = authMethod;
  }

   /**
   * 显示模式
   * @return displayName
  **/
  @javax.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

   /**
   * 身份提供者IDP代码
   * @return providerCode
  **/
  @javax.annotation.Nullable
  public String getProviderCode() {
    return providerCode;
  }


  public void setProviderCode(String providerCode) {
    this.providerCode = providerCode;
  }

   /**
   * Get configFields
   * @return configFields
  **/
  @javax.annotation.Nonnull
  public CreateAuthConfigReqConfigFields getConfigFields() {
    return configFields;
  }


  public void setConfigFields(CreateAuthConfigReqConfigFields configFields) {
    this.configFields = configFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAuthConfigReq createAuthConfigReq = (CreateAuthConfigReq) o;
    return Objects.equals(this.authMethod, createAuthConfigReq.authMethod) &&
        Objects.equals(this.displayName, createAuthConfigReq.displayName) &&
        Objects.equals(this.providerCode, createAuthConfigReq.providerCode) &&
        Objects.equals(this.configFields, createAuthConfigReq.configFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authMethod, displayName, providerCode, configFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAuthConfigReq {\n");
    sb.append("    authMethod: ").append(toIndentedString(authMethod)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
    sb.append("    configFields: ").append(toIndentedString(configFields)).append("\n");
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
    openapiFields.add("auth_method");
    openapiFields.add("display_name");
    openapiFields.add("provider_code");
    openapiFields.add("config_fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("auth_method");
    openapiRequiredFields.add("display_name");
    openapiRequiredFields.add("config_fields");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateAuthConfigReq
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAuthConfigReq.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAuthConfigReq is not found in the empty JSON string", CreateAuthConfigReq.openapiRequiredFields.toString()));
        }
      }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAuthConfigReq.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("auth_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_method").toString()));
      }
      if (!jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if ((jsonObj.get("provider_code") != null && !jsonObj.get("provider_code").isJsonNull()) && !jsonObj.get("provider_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_code").toString()));
      }
      // validate the required field `config_fields`
      CreateAuthConfigReqConfigFields.validateJsonElement(jsonObj.get("config_fields"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAuthConfigReq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAuthConfigReq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAuthConfigReq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAuthConfigReq.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAuthConfigReq>() {
           @Override
           public void write(JsonWriter out, CreateAuthConfigReq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAuthConfigReq read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAuthConfigReq given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAuthConfigReq
  * @throws IOException if the JSON string is invalid with respect to CreateAuthConfigReq
  */
  public static CreateAuthConfigReq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAuthConfigReq.class);
  }

 /**
  * Convert an instance of CreateAuthConfigReq to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

