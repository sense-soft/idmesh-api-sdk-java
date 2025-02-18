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
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;

import cn.idmesh.JSON;

/**
 * MFA
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MFA {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "provider_type";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private String providerType;

  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private String configId;

  public static final String SERIALIZED_NAME_SCENARIOS = "scenarios";
  @SerializedName(SERIALIZED_NAME_SCENARIOS)
  private List<String> scenarios = new ArrayList<>();

  public MFA() {
  }
   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

   /**
   * Get providerType
   * @return providerType
  **/
  @javax.annotation.Nonnull
  public String getProviderType() {
    return providerType;
  }


  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nonnull
  public String getConfigId() {
    return configId;
  }


  public void setConfigId(String configId) {
    this.configId = configId;
  }

   /**
   * Get scenarios
   * @return scenarios
  **/
  @javax.annotation.Nonnull
  public List<String> getScenarios() {
    return scenarios;
  }


  public void setScenarios(List<String> scenarios) {
    this.scenarios = scenarios;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MFA ___MFA__ = (MFA) o;
    return Objects.equals(this.name, ___MFA__.name) &&
        Objects.equals(this.providerType, ___MFA__.providerType) &&
        Objects.equals(this.configId, ___MFA__.configId) &&
        Objects.equals(this.scenarios, ___MFA__.scenarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, providerType, configId, scenarios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MFA {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("provider_type");
    openapiFields.add("config_id");
    openapiFields.add("scenarios");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("provider_type");
    openapiRequiredFields.add("config_id");
    openapiRequiredFields.add("scenarios");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MFA
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MFA.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MFA is not found in the empty JSON string", MFA.openapiRequiredFields.toString()));
        }
      }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MFA.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("provider_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_type").toString()));
      }
      if (!jsonObj.get("config_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config_id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("scenarios") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("scenarios").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scenarios` to be an array in the JSON string but got `%s`", jsonObj.get("scenarios").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MFA.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MFA' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MFA> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MFA.class));

       return (TypeAdapter<T>) new TypeAdapter<MFA>() {
           @Override
           public void write(JsonWriter out, MFA value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MFA read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MFA given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MFA
  * @throws IOException if the JSON string is invalid with respect to MFA
  */
  public static MFA fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MFA.class);
  }

 /**
  * Convert an instance of MFA to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

