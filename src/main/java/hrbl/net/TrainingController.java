package hrbl.net;


import Entities.*;
import Entities.Request.*;
import Entities.Response.*;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.wildfly.common.annotation.Nullable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Path("/training")
public class TrainingController {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/SaveCourseCompletion")
    public SaveCourseCompletionResponse SaveCourseCompletion(SaveCourseCompletionRequest request) {

        SaveCourseCompletionResponse responseAction = new SaveCourseCompletionResponse();
        if(request.dsId == null || request.dsId == "") {
            responseAction.response.status = Status.Error;
            responseAction.response.message="Dsid is missing";
            return responseAction;
        }


        responseAction.response.status = Status.Success;
        responseAction.response.message="";
        return responseAction;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/GetAssigment")
    public GetAssigmentResponse GetAssigment(
            @QueryParam("dsId") String dsId
    )
    {
        GetAssigmentResponse responseAction = new GetAssigmentResponse();
        if(dsId == null || dsId.length() == 0)
        {
            responseAction.response.status = Status.Error;
            responseAction.response.message="Dsid is missing";
            return responseAction;
        }
        responseAction.cop="US";
        responseAction.dsId=dsId;
        responseAction.distributorFirstName ="Subrat";
        responseAction.distributorLastName="Dey";
        responseAction.subTypeCode ="PT";

        Hashtable<String, String> flags = new Hashtable<String, String>();
        flags.put("NCOTFlag","0");
        flags.put("RCPT1Flag","0");
        flags.put("RCPT1Flag","1");
        flags.put("MANDTRNGFlag","1");
        flags.put("TABFlag","1");
        flags.put("DistibutorStatus","Complete");
        flags.put("DistributorType","3");

        responseAction.flags=flags;
        responseAction.response.status = Status.Success;
        responseAction.response.message="";
        return responseAction;

    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/SaveAwardCompletion")
    public SaveAwardCompletionResponse SaveAwardCompletion(SaveAwardCompletionRequest request) {

        SaveAwardCompletionResponse responseAction = new SaveAwardCompletionResponse();
        if(request.dsId == null || request.dsId == "") {
            responseAction.response.status = Status.Error;
            responseAction.response.message="Dsid is missing";
            return responseAction;
        }


        responseAction.response.status = Status.Success;
        responseAction.response.message="";
        return responseAction;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/UpdateCourseCatalog")
    public UpdateCourseCatalogResponse UpdateCourseCatalog(UpdateCourseCatalogRequest request) {

        UpdateCourseCatalogResponse responseAction = new UpdateCourseCatalogResponse();
        if(request.courseKey == null || request.courseKey == "") {
            responseAction.response.status = Status.Error;
            responseAction.response.message="CourseKey is missing";
            return responseAction;
        }


        responseAction.response.status = Status.Success;
        responseAction.response.message="";
        return responseAction;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/PurgeUser")
    public PurgeUserResponse PurgeUser(
            PurgeUserRequest request
    )
    {
        PurgeUserResponse responseAction = new PurgeUserResponse();
        if(request.dsId == null || request.dsId == "")
        {
            responseAction.response.status = Status.Error;
            responseAction.response.message="Dsid is missing";
            return responseAction;
        }

        responseAction.response.status = Status.Success;
        responseAction.response.message="Records found in Db";
        return responseAction;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/GetAwardTranscript")
    public GetAwardTranscriptResponse GetAwardTranscript(
            @QueryParam("dsId") String dsId
    )
    {
        GetAwardTranscriptResponse responseAction = new GetAwardTranscriptResponse();
        if(dsId == null || dsId.length() == 0)
        {
            responseAction.response.status = Status.Error;
            responseAction.response.message="Dsid is missing";
            return responseAction;
        }

        //region Add MemberAwardExamples
        List<MemberAward> list= new ArrayList<MemberAward>();
        MemberAward award = new MemberAward();
        award.awardKey="CRT_AST_BasicAcademy1_deDE";
        award.dsId="HERB100297";
        award.uniqueId="B7AFCFA5-4000-4503-97DE-685732B36FAD";
        award.awardTier="Basic Academy 1";
        award.awardType="Certificate";
        award.awardDateEarned= LocalDateTime.parse("2022-04-09T20:47:17.000");
        award.awardLocale="de-DE";
        award.status= TrackingStatus.Completed;
        award.awardName="Basic Academy 1";
        list.add(award);

        award = new MemberAward();
        award.awardKey="BDG_FOU_NutritionLifestyle_enUS";
        award.dsId="HERB100318";
        award.uniqueId="8AE3F689-5EF6-47ED-8C9C-C360028C3B5B";
        award.awardTier="Foundation";
        award.awardType="Badge";
        award.awardDateEarned= LocalDateTime.parse("2022-12-13T14:08:17.330");
        award.awardLocale="en-US";
        award.status= TrackingStatus.Completed;
        award.awardName="Nutrition Lifestyle";
        list.add(award);
        //endregion

        responseAction.memberAwards= list;
        responseAction.response.status = Status.Success;
        responseAction.response.message="";
        return responseAction;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/GetDistributorTranscript")
    public GetDistributorTranscriptResponse GetDistributorTranscript(
            @QueryParam("dsId") String dsId,
            @QueryParam("completed") @Nullable boolean completed,
            @QueryParam("only Mandatory") @Nullable boolean onlyMandatory,
            @QueryParam("most Popular") @Nullable boolean mostPopular
    )
    {
        GetDistributorTranscriptResponse responseAction = new GetDistributorTranscriptResponse();
        if(dsId == null || dsId.length() == 0)
        {
            responseAction.response.status = Status.Error;
            responseAction.response.message="Dsid is missing";
            return responseAction;
        }

        //region Add DistributorCourseTracking Examples
        List<DistributorCourseTracking> list= new ArrayList<DistributorCourseTracking>();

        DistributorCourseTracking courseTracking = new DistributorCourseTracking();
        courseTracking.courseKey= "ETH_0002_A_enUS";
        courseTracking.dsId= "HERB100314";
        courseTracking.status = TrackingStatus.Completed;
        courseTracking.score=100;
        courseTracking.completionDateUtc= LocalDateTime.parse("2023-03-21T13:37:48.000");
        courseTracking.localeHist ="en-US";
        courseTracking.totalTime=8;
        courseTracking.interfaceValue = Interface.RUBICON_WEB;
        courseTracking.firstStudyDate= LocalDateTime.parse("2023-03-21T13:37:48.000");;
        courseTracking.sessionCompletedDate = LocalDateTime.parse("2023-03-21T13:37:48.000");
        courseTracking.totalAttempts = 1;
        courseTracking.courseCategory = "Protecting your business";
        courseTracking.courseType = "Tutorial";
        courseTracking.mandatory = false;

        list.add(courseTracking);

        courseTracking = new DistributorCourseTracking();
        courseTracking.courseKey= "PRO_4343_enUS";
        courseTracking.dsId= "HERB100314";
        courseTracking.status = TrackingStatus.Completed;
        courseTracking.score=100;
        courseTracking.completionDateUtc= LocalDateTime.parse("2023-03-21T13:37:48.000");
        courseTracking.localeHist ="en-US";
        courseTracking.totalTime=939;
        courseTracking.interfaceValue = Interface.IVRSERVICE;
        courseTracking.firstStudyDate= LocalDateTime.parse("2023-03-21T13:37:48.000");;
        courseTracking.sessionCompletedDate = LocalDateTime.parse("2023-03-21T13:37:48.000");
        courseTracking.totalAttempts = 2;
        courseTracking.courseCategory = "Product";
        courseTracking.courseType = "PDF";
        courseTracking.mandatory = false;

        list.add(courseTracking);
        //endregion

        responseAction.distributorCourseTrackings= list;
        responseAction.response.status = Status.Success;
        responseAction.response.message="";
        return responseAction;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/SaveAssigmentProperties")
    public SaveAssigmentPropertiesResponse SaveAssigmentProperties(
            SaveAssigmentPropertiesRequest request
    )
    {
        SaveAssigmentPropertiesResponse responseAction = new SaveAssigmentPropertiesResponse();
        if(request.flagCode == null || request.flagCode == "")
        {
            responseAction.response.status = Status.Error;
            responseAction.response.message="flag code is missing";
            return responseAction;
        }

        responseAction.response.status = Status.Success;
        responseAction.response.message="";
        return responseAction;

    }

}
