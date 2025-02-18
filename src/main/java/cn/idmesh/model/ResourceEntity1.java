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
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;

import cn.idmesh.JSON;

/**
 * ResourceEntity1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResourceEntity1 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<String> actions;

  public static final String SERIALIZED_NAME_MATCH_ALL_ACTIONS = "match_all_actions";
  @SerializedName(SERIALIZED_NAME_MATCH_ALL_ACTIONS)
  private Boolean matchAllActions;

  public static final String SERIALIZED_NAME_MATCH_ALL_RESOURCES = "match_all_resources";
  @SerializedName(SERIALIZED_NAME_MATCH_ALL_RESOURCES)
  private Boolean matchAllResources;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_APPLICATION_NAME = "application_name";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public ResourceEntity1() {
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
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nonnull
  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nullable
  public List<String> getActions() {
    return actions;
  }


  public void setActions(List<String> actions) {
    this.actions = actions;
  }

   /**
   * Get matchAllActions
   * @return matchAllActions
  **/
  @javax.annotation.Nullable
  public Boolean getMatchAllActions() {
    return matchAllActions;
  }


  public void setMatchAllActions(Boolean matchAllActions) {
    this.matchAllActions = matchAllActions;
  }

   /**
   * Get matchAllResources
   * @return matchAllResources
  **/
  @javax.annotation.Nullable
  public Boolean getMatchAllResources() {
    return matchAllResources;
  }


  public void setMatchAllResources(Boolean matchAllResources) {
    this.matchAllResources = matchAllResources;
  }

   /**
   * 当match_all_resources&#x3D;true时必填
   * @return applicationId
  **/
  @javax.annotation.Nullable
  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

   /**
   * 当match_all_resources&#x3D;true时必填
   * @return applicationName
  **/
  @javax.annotation.Nullable
  public String getApplicationName() {
    return applicationName;
  }


  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceEntity1 resourceEntity1 = (ResourceEntity1) o;
    return Objects.equals(this.id, resourceEntity1.id) &&
        Objects.equals(this.scope, resourceEntity1.scope) &&
        Objects.equals(this.actions, resourceEntity1.actions) &&
        Objects.equals(this.matchAllActions, resourceEntity1.matchAllActions) &&
        Objects.equals(this.matchAllResources, resourceEntity1.matchAllResources) &&
        Objects.equals(this.applicationId, resourceEntity1.applicationId) &&
        Objects.equals(this.applicationName, resourceEntity1.applicationName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scope, actions, matchAllActions, matchAllResources, applicationId, applicationName);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceEntity1 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    matchAllActions: ").append(toIndentedString(matchAllActions)).append("\n");
    sb.append("    matchAllResources: ").append(toIndentedString(matchAllResources)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
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
    openapiFields.add("scope");
    openapiFields.add("actions");
    openapiFields.add("match_all_actions");
    openapiFields.add("match_all_resources");
    openapiFields.add("application_id");
    openapiFields.add("application_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("scope");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResourceEntity1
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResourceEntity1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceEntity1 is not found in the empty JSON string", ResourceEntity1.openapiRequiredFields.toString()));
        }
      }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResourceEntity1.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull() && !jsonObj.get("actions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
      }
      if ((jsonObj.get("application_id") != null && !jsonObj.get("application_id").isJsonNull()) && !jsonObj.get("application_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_id").toString()));
      }
      if ((jsonObj.get("application_name") != null && !jsonObj.get("application_name").isJsonNull()) && !jsonObj.get("application_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResourceEntity1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceEntity1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceEntity1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceEntity1.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceEntity1>() {
           @Override
           public void write(JsonWriter out, ResourceEntity1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceEntity1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResourceEntity1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResourceEntity1
  * @throws IOException if the JSON string is invalid with respect to ResourceEntity1
  */
  public static ResourceEntity1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceEntity1.class);
  }

 /**
  * Convert an instance of ResourceEntity1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

