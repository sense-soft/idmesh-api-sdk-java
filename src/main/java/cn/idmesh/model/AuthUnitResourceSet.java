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
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;

import cn.idmesh.JSON;

/**
 * AuthUnitResourceSet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthUnitResourceSet {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_APPLICATION_NAME = "application_name";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public static final String SERIALIZED_NAME_IS_GLOBAL = "is_global";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL)
  private Boolean isGlobal;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TIME_MODIFIED = "time_modified";
  @SerializedName(SERIALIZED_NAME_TIME_MODIFIED)
  private String timeModified;

  public static final String SERIALIZED_NAME_TIME_CREATED = "time_created";
  @SerializedName(SERIALIZED_NAME_TIME_CREATED)
  private String timeCreated;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<ResourceSetMember> members;

  public static final String SERIALIZED_NAME_MATCH_ALL_RESOURCES = "match_all_resources";
  @SerializedName(SERIALIZED_NAME_MATCH_ALL_RESOURCES)
  private Boolean matchAllResources;

  public AuthUnitResourceSet() {
  }
   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }

   /**
   * Get applicationId
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
   * Get applicationName
   * @return applicationName
  **/
  @javax.annotation.Nullable
  public String getApplicationName() {
    return applicationName;
  }


  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

   /**
   * Get isGlobal
   * @return isGlobal
  **/
  @javax.annotation.Nullable
  public Boolean getIsGlobal() {
    return isGlobal;
  }


  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Get timeModified
   * @return timeModified
  **/
  @javax.annotation.Nullable
  public String getTimeModified() {
    return timeModified;
  }


  public void setTimeModified(String timeModified) {
    this.timeModified = timeModified;
  }

   /**
   * Get timeCreated
   * @return timeCreated
  **/
  @javax.annotation.Nullable
  public String getTimeCreated() {
    return timeCreated;
  }


  public void setTimeCreated(String timeCreated) {
    this.timeCreated = timeCreated;
  }

   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nullable
  public List<ResourceSetMember> getMembers() {
    return members;
  }


  public void setMembers(List<ResourceSetMember> members) {
    this.members = members;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthUnitResourceSet authUnitResourceSet = (AuthUnitResourceSet) o;
    return Objects.equals(this.id, authUnitResourceSet.id) &&
        Objects.equals(this.applicationId, authUnitResourceSet.applicationId) &&
        Objects.equals(this.applicationName, authUnitResourceSet.applicationName) &&
        Objects.equals(this.isGlobal, authUnitResourceSet.isGlobal) &&
        Objects.equals(this.code, authUnitResourceSet.code) &&
        Objects.equals(this.description, authUnitResourceSet.description) &&
        Objects.equals(this.timeModified, authUnitResourceSet.timeModified) &&
        Objects.equals(this.timeCreated, authUnitResourceSet.timeCreated) &&
        Objects.equals(this.members, authUnitResourceSet.members) &&
        Objects.equals(this.matchAllResources, authUnitResourceSet.matchAllResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, applicationId, applicationName, isGlobal, code, description, timeModified, timeCreated, members, matchAllResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthUnitResourceSet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timeModified: ").append(toIndentedString(timeModified)).append("\n");
    sb.append("    timeCreated: ").append(toIndentedString(timeCreated)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    matchAllResources: ").append(toIndentedString(matchAllResources)).append("\n");
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
    openapiFields.add("application_id");
    openapiFields.add("application_name");
    openapiFields.add("is_global");
    openapiFields.add("code");
    openapiFields.add("description");
    openapiFields.add("time_modified");
    openapiFields.add("time_created");
    openapiFields.add("members");
    openapiFields.add("match_all_resources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuthUnitResourceSet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthUnitResourceSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthUnitResourceSet is not found in the empty JSON string", AuthUnitResourceSet.openapiRequiredFields.toString()));
        }
      }

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("application_id") != null && !jsonObj.get("application_id").isJsonNull()) && !jsonObj.get("application_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_id").toString()));
      }
      if ((jsonObj.get("application_name") != null && !jsonObj.get("application_name").isJsonNull()) && !jsonObj.get("application_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_name").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("time_modified") != null && !jsonObj.get("time_modified").isJsonNull()) && !jsonObj.get("time_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_modified").toString()));
      }
      if ((jsonObj.get("time_created") != null && !jsonObj.get("time_created").isJsonNull()) && !jsonObj.get("time_created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_created").toString()));
      }
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull()) {
        JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
        if (jsonArraymembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
          }

          // validate the optional field `members` (array)
          for (int i = 0; i < jsonArraymembers.size(); i++) {
            ResourceSetMember.validateJsonElement(jsonArraymembers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthUnitResourceSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthUnitResourceSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthUnitResourceSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthUnitResourceSet.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthUnitResourceSet>() {
           @Override
           public void write(JsonWriter out, AuthUnitResourceSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthUnitResourceSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthUnitResourceSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthUnitResourceSet
  * @throws IOException if the JSON string is invalid with respect to AuthUnitResourceSet
  */
  public static AuthUnitResourceSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthUnitResourceSet.class);
  }

 /**
  * Convert an instance of AuthUnitResourceSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

