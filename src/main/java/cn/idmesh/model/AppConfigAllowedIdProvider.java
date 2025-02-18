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
 * 格式为：{\&quot;wechat_scan_qr\&quot;: 1, \&quot;dingding_scan_qr\&quot;: 2}
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppConfigAllowedIdProvider {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDP_CODE = "idp_code";
  @SerializedName(SERIALIZED_NAME_IDP_CODE)
  private String idpCode;

  public static final String SERIALIZED_NAME_IDP_CONFIG_ID = "idp_config_id";
  @SerializedName(SERIALIZED_NAME_IDP_CONFIG_ID)
  private String idpConfigId;

  public static final String SERIALIZED_NAME_AUTH_METHOD_CODE = "auth_method_code";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_CODE)
  private String authMethodCode;

  public static final String SERIALIZED_NAME_AUTH_METHOD_DISPLAY_NAME = "auth_method_display_name";
  @SerializedName(SERIALIZED_NAME_AUTH_METHOD_DISPLAY_NAME)
  private String authMethodDisplayName;

  public AppConfigAllowedIdProvider() {
  }
   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }

   /**
   * Get idpCode
   * @return idpCode
  **/
  @javax.annotation.Nonnull
  public String getIdpCode() {
    return idpCode;
  }


  public void setIdpCode(String idpCode) {
    this.idpCode = idpCode;
  }

   /**
   * Get idpConfigId
   * @return idpConfigId
  **/
  @javax.annotation.Nonnull
  public String getIdpConfigId() {
    return idpConfigId;
  }


  public void setIdpConfigId(String idpConfigId) {
    this.idpConfigId = idpConfigId;
  }

   /**
   * Get authMethodCode
   * @return authMethodCode
  **/
  @javax.annotation.Nonnull
  public String getAuthMethodCode() {
    return authMethodCode;
  }


  public void setAuthMethodCode(String authMethodCode) {
    this.authMethodCode = authMethodCode;
  }

   /**
   * Get authMethodDisplayName
   * @return authMethodDisplayName
  **/
  @javax.annotation.Nonnull
  public String getAuthMethodDisplayName() {
    return authMethodDisplayName;
  }


  public void setAuthMethodDisplayName(String authMethodDisplayName) {
    this.authMethodDisplayName = authMethodDisplayName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppConfigAllowedIdProvider appConfigAllowedIdProvider = (AppConfigAllowedIdProvider) o;
    return Objects.equals(this.id, appConfigAllowedIdProvider.id) &&
        Objects.equals(this.idpCode, appConfigAllowedIdProvider.idpCode) &&
        Objects.equals(this.idpConfigId, appConfigAllowedIdProvider.idpConfigId) &&
        Objects.equals(this.authMethodCode, appConfigAllowedIdProvider.authMethodCode) &&
        Objects.equals(this.authMethodDisplayName, appConfigAllowedIdProvider.authMethodDisplayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idpCode, idpConfigId, authMethodCode, authMethodDisplayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppConfigAllowedIdProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idpCode: ").append(toIndentedString(idpCode)).append("\n");
    sb.append("    idpConfigId: ").append(toIndentedString(idpConfigId)).append("\n");
    sb.append("    authMethodCode: ").append(toIndentedString(authMethodCode)).append("\n");
    sb.append("    authMethodDisplayName: ").append(toIndentedString(authMethodDisplayName)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("idp_code");
    openapiFields.add("idp_config_id");
    openapiFields.add("auth_method_code");
    openapiFields.add("auth_method_display_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("idp_code");
    openapiRequiredFields.add("idp_config_id");
    openapiRequiredFields.add("auth_method_code");
    openapiRequiredFields.add("auth_method_display_name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppConfigAllowedIdProvider
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppConfigAllowedIdProvider.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppConfigAllowedIdProvider is not found in the empty JSON string", AppConfigAllowedIdProvider.openapiRequiredFields.toString()));
        }
      }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AppConfigAllowedIdProvider.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("idp_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idp_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idp_code").toString()));
      }
      if (!jsonObj.get("idp_config_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idp_config_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idp_config_id").toString()));
      }
      if (!jsonObj.get("auth_method_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_method_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_method_code").toString()));
      }
      if (!jsonObj.get("auth_method_display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_method_display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_method_display_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppConfigAllowedIdProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppConfigAllowedIdProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppConfigAllowedIdProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppConfigAllowedIdProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<AppConfigAllowedIdProvider>() {
           @Override
           public void write(JsonWriter out, AppConfigAllowedIdProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppConfigAllowedIdProvider read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppConfigAllowedIdProvider given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppConfigAllowedIdProvider
  * @throws IOException if the JSON string is invalid with respect to AppConfigAllowedIdProvider
  */
  public static AppConfigAllowedIdProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppConfigAllowedIdProvider.class);
  }

 /**
  * Convert an instance of AppConfigAllowedIdProvider to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

