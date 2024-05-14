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


package com.idmesh.api;

import com.idmesh.ApiClient;
import com.idmesh.ApiException;
import com.idmesh.model.Au;
import com.idmesh.model.AuthUnitRet;
import com.idmesh.model.AuthUnitWithPage;
import com.idmesh.model.BadRequest;
import com.idmesh.model.BatchCreateAuthUnitRuleReq;
import com.idmesh.model.BatchDeleteAuthUnitRuleReq;
import com.idmesh.model.BatchDeleteResourceReq;
import com.idmesh.model.CreateResourceReq;
import com.idmesh.model.CreateResourceSetMemberReq;
import com.idmesh.model.CreateResourceSetMemberRet;
import com.idmesh.model.CreateResourceSetReq;
import com.idmesh.model.CreateResourceSetRet;
import com.idmesh.model.CreateResoureRet;
import com.idmesh.model.ModifyAuthUnitRequest;
import com.idmesh.model.ModifyResourceSetMemberReq;
import com.idmesh.model.ModifyResourceSetReq;
import com.idmesh.model.ResourceEntity;
import com.idmesh.model.ResourceSet;
import com.idmesh.model.ResourceSetMember;
import com.idmesh.model.ResourceSetMemberWithPage;
import com.idmesh.model.ResourceSetWithPage;
import com.idmesh.model.ResourceWithPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionApi
 */
@Disabled
public class PermissionApiTest {

    private final ApiClient apiClient = new ApiClient("http://service-gate.api.dev.idmesh.site", "u4X5vTGPH4NCdNTylSYn1JHe", "BkCCUZLVVR9wSi2aiYTOYUZDKps7xgQT");
    private final PermissionApi api = new PermissionApi(apiClient);

    /**
     * 批量创建授权规则
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAuthUnitRulesTest() throws ApiException {
        String contentType = null;
        String xTenantId = null;
        BatchCreateAuthUnitRuleReq batchCreateAuthUnitRuleReq = null;
        Object response = api.createAuthUnitRules(contentType)
                .xTenantId(xTenantId)
                .batchCreateAuthUnitRuleReq(batchCreateAuthUnitRuleReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 创建资源
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createResourceTest() throws ApiException {
        String contentType = null;
        CreateResourceReq createResourceReq = null;
        CreateResoureRet response = api.createResource(contentType)
                .createResourceReq(createResourceReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 创建资源集合
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createResourceSetTest() throws ApiException {
        String contentType = null;
        String xTenantId = null;
        CreateResourceSetReq createResourceSetReq = null;
        CreateResourceSetRet response = api.createResourceSet(contentType, xTenantId)
                .createResourceSetReq(createResourceSetReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 创建资源集合成员
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createResourceSetMemberTest() throws ApiException {
        String id = null;
        String contentType = null;
        CreateResourceSetMemberReq createResourceSetMemberReq = null;
        CreateResourceSetMemberRet response = api.createResourceSetMember(id, contentType)
                .createResourceSetMemberReq(createResourceSetMemberReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 批量删除授权规则
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAuthUnitRulesTest() throws ApiException {
        String contentType = null;
        BatchDeleteAuthUnitRuleReq batchDeleteAuthUnitRuleReq = null;
        Object response = api.deleteAuthUnitRules(contentType)
                .batchDeleteAuthUnitRuleReq(batchDeleteAuthUnitRuleReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 删除资源
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteResourcesTest() throws ApiException {
        String contentType = null;
        BatchDeleteResourceReq batchDeleteResourceReq = null;
        Object response = api.deleteResources(contentType)
                .batchDeleteResourceReq(batchDeleteResourceReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 按 ID 查询授权单元
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAuthUnitTest() throws ApiException {
        String id = null;
        AuthUnitRet response = api.getAuthUnit(id)
                .execute();
        // TODO: test validations
    }

    /**
     * 获取授权单元列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAuthUnitsTest() throws ApiException {
        String identityId = null;
        String identityType = null;
        String identityName = null;
        String pageNum = null;
        String pageSize = null;
        String pageSort = null;
        AuthUnitWithPage response = api.getAuthUnits()
                .identityId(identityId)
                .identityType(identityType)
                .identityName(identityName)
                .pageNum(pageNum)
                .pageSize(pageSize)
                .pageSort(pageSort)
                .execute();
        // TODO: test validations
    }

    /**
     * 查询授权单元下的授权规则列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAuthUnitsRulesTest() throws ApiException {
        String rid = null;
        String applicationId = null;
        String type = null;
        String code = null;
        String selfOnly = null;
        String resourceId = null;
        String resourceMatchAllResources = null;
        String resourceMatchAllActions = null;
        String resourceSetId = null;
        String pageMode = null;
        List<Au> response = api.getAuthUnitsRules(rid)
                .applicationId(applicationId)
                .type(type)
                .code(code)
                .selfOnly(selfOnly)
                .resourceId(resourceId)
                .resourceMatchAllResources(resourceMatchAllResources)
                .resourceMatchAllActions(resourceMatchAllActions)
                .resourceSetId(resourceSetId)
                .pageMode(pageMode)
                .execute();
        // TODO: test validations
    }

    /**
     * 按 ID 查询资源
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourceTest() throws ApiException {
        String id = null;
        String applicationId = null;
        ResourceEntity response = api.getResource(id, applicationId)
                .execute();
        // TODO: test validations
    }

    /**
     * 按 ID 查询资源集合成员
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourceMemberTest() throws ApiException {
        String sid = null;
        String mid = null;
        ResourceSetMember response = api.getResourceMember(sid, mid)
                .execute();
        // TODO: test validations
    }

    /**
     * 查询资源集合成员列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourceMembersTest() throws ApiException {
        String sid = null;
        String resourceCode = null;
        String resourceType = null;
        String pageNum = null;
        String pageSize = null;
        String pageSort = null;
        ResourceSetMemberWithPage response = api.getResourceMembers(sid)
                .resourceCode(resourceCode)
                .resourceType(resourceType)
                .pageNum(pageNum)
                .pageSize(pageSize)
                .pageSort(pageSort)
                .execute();
        // TODO: test validations
    }

    /**
     * 按 ID 查询资源集合
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourceSetTest() throws ApiException {
        String id = null;
        ResourceSet response = api.getResourceSet(id)
                .execute();
        // TODO: test validations
    }

    /**
     * 查询资源集合列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourceSetsTest() throws ApiException {
        String applicationId = null;
        String code = null;
        String includeGlobal = null;
        String pageNum = null;
        String pageSize = null;
        String pageSort = null;
        ResourceSetWithPage response = api.getResourceSets(applicationId)
                .code(code)
                .includeGlobal(includeGlobal)
                .pageNum(pageNum)
                .pageSize(pageSize)
                .pageSort(pageSort)
                .execute();
        // TODO: test validations
    }

    /**
     * 查询资源列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResourcesTest() throws ApiException {
        String applicationId = null;
        String type = null;
        String code = null;
        String includeGlobal = null;
        String pageNum = null;
        String pageSize = null;
        String pageSort = null;
        String pageMode = null;
        ResourceWithPage response = api.getResources(applicationId)
                .type(type)
                .code(code)
                .includeGlobal(includeGlobal)
                .pageNum(pageNum)
                .pageSize(pageSize)
                .pageSort(pageSort)
                .pageMode(pageMode)
                .execute();
        // TODO: test validations
    }

    /**
     * 更新授权规则
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyAuthUnitTest() throws ApiException {
        String rid = null;
        String tid = null;
        String contentType = null;
        ModifyAuthUnitRequest modifyAuthUnitRequest = null;
        Object response = api.modifyAuthUnit(rid, tid, contentType)
                .modifyAuthUnitRequest(modifyAuthUnitRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * 更新资源集合
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyResourceSetTest() throws ApiException {
        String id = null;
        String contentType = null;
        String xTenantId = null;
        ModifyResourceSetReq modifyResourceSetReq = null;
        Object response = api.modifyResourceSet(id, contentType, xTenantId)
                .modifyResourceSetReq(modifyResourceSetReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 更新资源集合成员
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyResourceSetMemberTest() throws ApiException {
        String sid = null;
        String mid = null;
        String contentType = null;
        ModifyResourceSetMemberReq modifyResourceSetMemberReq = null;
        Object response = api.modifyResourceSetMember(sid, mid, contentType)
                .modifyResourceSetMemberReq(modifyResourceSetMemberReq)
                .execute();
        // TODO: test validations
    }

    /**
     * 查询授权规则列表
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryAuthUnitsRulesTest() throws ApiException {
        String identityId = null;
        String identityType = null;
        String applicationId = null;
        String type = null;
        String code = null;
        String identityName = null;
        String selfOnly = null;
        String resourceId = null;
        String resourceMatchAllResources = null;
        String resourceMatchAllActions = null;
        String resourceSetId = null;
        String pageMode = null;
        List<Au> response = api.queryAuthUnitsRules(identityId, identityType)
                .applicationId(applicationId)
                .type(type)
                .code(code)
                .identityName(identityName)
                .selfOnly(selfOnly)
                .resourceId(resourceId)
                .resourceMatchAllResources(resourceMatchAllResources)
                .resourceMatchAllActions(resourceMatchAllActions)
                .resourceSetId(resourceSetId)
                .pageMode(pageMode)
                .execute();
        // TODO: test validations
    }

}
