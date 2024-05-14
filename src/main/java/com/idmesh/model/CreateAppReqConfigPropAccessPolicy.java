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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * CreateAppReqConfigPropAccessPolicy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAppReqConfigPropAccessPolicy {
  public static final String SERIALIZED_NAME_FORGET_PASSWORD = "forget_password";
  @SerializedName(SERIALIZED_NAME_FORGET_PASSWORD)
  private List<String> forgetPassword;

  public CreateAppReqConfigPropAccessPolicy() {
  }
   /**
   * Get forgetPassword
   * @return forgetPassword
  **/
  @javax.annotation.Nullable
  public List<String> getForgetPassword() {
    return forgetPassword;
  }


  public void setForgetPassword(List<String> forgetPassword) {
    this.forgetPassword = forgetPassword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAppReqConfigPropAccessPolicy createAppReqConfigPropAccessPolicy = (CreateAppReqConfigPropAccessPolicy) o;
    return Objects.equals(this.forgetPassword, createAppReqConfigPropAccessPolicy.forgetPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forgetPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAppReqConfigPropAccessPolicy {\n");
    sb.append("    forgetPassword: ").append(toIndentedString(forgetPassword)).append("\n");
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
    openapiFields.add("forget_password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateAppReqConfigPropAccessPolicy
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAppReqConfigPropAccessPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAppReqConfigPropAccessPolicy is not found in the empty JSON string", CreateAppReqConfigPropAccessPolicy.openapiRequiredFields.toString()));
        }
      }

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("forget_password") != null && !jsonObj.get("forget_password").isJsonNull() && !jsonObj.get("forget_password").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `forget_password` to be an array in the JSON string but got `%s`", jsonObj.get("forget_password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAppReqConfigPropAccessPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAppReqConfigPropAccessPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAppReqConfigPropAccessPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAppReqConfigPropAccessPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAppReqConfigPropAccessPolicy>() {
           @Override
           public void write(JsonWriter out, CreateAppReqConfigPropAccessPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAppReqConfigPropAccessPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAppReqConfigPropAccessPolicy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAppReqConfigPropAccessPolicy
  * @throws IOException if the JSON string is invalid with respect to CreateAppReqConfigPropAccessPolicy
  */
  public static CreateAppReqConfigPropAccessPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAppReqConfigPropAccessPolicy.class);
  }

 /**
  * Convert an instance of CreateAppReqConfigPropAccessPolicy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

