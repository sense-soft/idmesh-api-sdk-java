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
 * ModifyOrganizationReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModifyOrganizationReq {
  public static final String SERIALIZED_NAME_OBJECT_DISPLAY_NAME = "object_display_name";
  @SerializedName(SERIALIZED_NAME_OBJECT_DISPLAY_NAME)
  private String objectDisplayName;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_OBJECT_PROPS = "object_props";
  @SerializedName(SERIALIZED_NAME_OBJECT_PROPS)
  private Object objectProps;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private String isDefault;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ModifyOrganizationReq() {
  }
   /**
   * Get objectDisplayName
   * @return objectDisplayName
  **/
  @javax.annotation.Nullable
  public String getObjectDisplayName() {
    return objectDisplayName;
  }


  public void setObjectDisplayName(String objectDisplayName) {
    this.objectDisplayName = objectDisplayName;
  }

   /**
   *  固定值：tree
   * @return objectType
  **/
  @javax.annotation.Nullable
  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

   /**
   * Get objectProps
   * @return objectProps
  **/
  @javax.annotation.Nullable
  public Object getObjectProps() {
    return objectProps;
  }


  public void setObjectProps(Object objectProps) {
    this.objectProps = objectProps;
  }

   /**
   * 是否默认组织关系，1是，0否
   * @return isDefault
  **/
  @javax.annotation.Nullable
  public String getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * 0角色，1组织树
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyOrganizationReq modifyOrganizationReq = (ModifyOrganizationReq) o;
    return Objects.equals(this.objectDisplayName, modifyOrganizationReq.objectDisplayName) &&
        Objects.equals(this.objectType, modifyOrganizationReq.objectType) &&
        Objects.equals(this.objectProps, modifyOrganizationReq.objectProps) &&
        Objects.equals(this.isDefault, modifyOrganizationReq.isDefault) &&
        Objects.equals(this.status, modifyOrganizationReq.status) &&
        Objects.equals(this.type, modifyOrganizationReq.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectDisplayName, objectType, objectProps, isDefault, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyOrganizationReq {\n");
    sb.append("    objectDisplayName: ").append(toIndentedString(objectDisplayName)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectProps: ").append(toIndentedString(objectProps)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("object_display_name");
    openapiFields.add("object_type");
    openapiFields.add("object_props");
    openapiFields.add("is_default");
    openapiFields.add("status");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModifyOrganizationReq
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModifyOrganizationReq.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModifyOrganizationReq is not found in the empty JSON string", ModifyOrganizationReq.openapiRequiredFields.toString()));
        }
      }

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("object_display_name") != null && !jsonObj.get("object_display_name").isJsonNull()) && !jsonObj.get("object_display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object_display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object_display_name").toString()));
      }
      if ((jsonObj.get("object_type") != null && !jsonObj.get("object_type").isJsonNull()) && !jsonObj.get("object_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object_type").toString()));
      }
      if ((jsonObj.get("is_default") != null && !jsonObj.get("is_default").isJsonNull()) && !jsonObj.get("is_default").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_default` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_default").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModifyOrganizationReq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModifyOrganizationReq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModifyOrganizationReq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModifyOrganizationReq.class));

       return (TypeAdapter<T>) new TypeAdapter<ModifyOrganizationReq>() {
           @Override
           public void write(JsonWriter out, ModifyOrganizationReq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModifyOrganizationReq read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModifyOrganizationReq given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModifyOrganizationReq
  * @throws IOException if the JSON string is invalid with respect to ModifyOrganizationReq
  */
  public static ModifyOrganizationReq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModifyOrganizationReq.class);
  }

 /**
  * Convert an instance of ModifyOrganizationReq to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

