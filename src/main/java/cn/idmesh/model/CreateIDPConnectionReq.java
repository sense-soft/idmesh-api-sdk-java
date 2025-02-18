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
 * CreateIDPConnectionReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateIDPConnectionReq {
  public static final String SERIALIZED_NAME_PROVIDER_CODE = "provider_code";
  @SerializedName(SERIALIZED_NAME_PROVIDER_CODE)
  private String providerCode;

  public static final String SERIALIZED_NAME_CONFIG_FIELDS = "config_fields";
  @SerializedName(SERIALIZED_NAME_CONFIG_FIELDS)
  private CreateIDPConnectionReqConfigFields configFields;

  public CreateIDPConnectionReq() {
  }
   /**
   * 身份源代码
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
  @javax.annotation.Nullable
  public CreateIDPConnectionReqConfigFields getConfigFields() {
    return configFields;
  }


  public void setConfigFields(CreateIDPConnectionReqConfigFields configFields) {
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
    CreateIDPConnectionReq createIDPConnectionReq = (CreateIDPConnectionReq) o;
    return Objects.equals(this.providerCode, createIDPConnectionReq.providerCode) &&
        Objects.equals(this.configFields, createIDPConnectionReq.configFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerCode, configFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIDPConnectionReq {\n");
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
    openapiFields.add("provider_code");
    openapiFields.add("config_fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateIDPConnectionReq
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateIDPConnectionReq.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateIDPConnectionReq is not found in the empty JSON string", CreateIDPConnectionReq.openapiRequiredFields.toString()));
        }
      }

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("provider_code") != null && !jsonObj.get("provider_code").isJsonNull()) && !jsonObj.get("provider_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_code").toString()));
      }
      // validate the optional field `config_fields`
      if (jsonObj.get("config_fields") != null && !jsonObj.get("config_fields").isJsonNull()) {
        CreateIDPConnectionReqConfigFields.validateJsonElement(jsonObj.get("config_fields"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateIDPConnectionReq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateIDPConnectionReq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateIDPConnectionReq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateIDPConnectionReq.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateIDPConnectionReq>() {
           @Override
           public void write(JsonWriter out, CreateIDPConnectionReq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateIDPConnectionReq read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateIDPConnectionReq given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateIDPConnectionReq
  * @throws IOException if the JSON string is invalid with respect to CreateIDPConnectionReq
  */
  public static CreateIDPConnectionReq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateIDPConnectionReq.class);
  }

 /**
  * Convert an instance of CreateIDPConnectionReq to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

