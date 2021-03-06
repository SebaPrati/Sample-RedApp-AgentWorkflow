package com.sabre.tn.redapp.example.workflow.xtpointservices.interfaces;

import java.util.Optional;

import com.sabre.stl.pos.srw.nextgen.flow.ext.v2.FlowExtPointCommand;

public interface IBeforeEndManualHandler {
	
	FlowExtPointCommand execute(FlowExtPointCommand extPointCommand);
	/*
    public static <T> Optional <T> fetchRequest(FlowExtPointCommand extPointCommand, Class <T> type)
    {
        return extPointCommand.getRequests().stream().map(wrapper -> wrapper.getRequest())
            .filter(type::isInstance).map(type::cast).findFirst();
    }	
	*/

}
