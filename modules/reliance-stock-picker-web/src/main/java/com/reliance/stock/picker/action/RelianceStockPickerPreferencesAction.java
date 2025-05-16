package com.reliance.stock.picker.action;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.reliance.stock.picker.constants.RelianceStockPickerWebPortletKeys;
import com.reliance.stock.picker.preferences.RelianceStockPickerConfiguration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import java.util.Map;

@Component(
        configurationPid = "com.reliance.stock.picker.preferences.RelianceStockPickerConfiguration",
        configurationPolicy = ConfigurationPolicy.OPTIONAL,
        immediate = true,
        property = "javax.portlet.name=" + RelianceStockPickerWebPortletKeys.RELIANCESTOCKPICKERWEB,
        service = ConfigurationAction.class
)
public class RelianceStockPickerPreferencesAction extends DefaultConfigurationAction {


    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

        String symbol = ParamUtil.getString(actionRequest, "symbol");
        String name = ParamUtil.getString(actionRequest, "name");
        setPreference(actionRequest, "symbol", symbol);
        setPreference(actionRequest, "name", name);
        super.processAction(portletConfig, actionRequest, actionResponse);
    }

    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {
        relianceStockPickerConfiguration = ConfigurableUtil.createConfigurable(RelianceStockPickerConfiguration.class,
                properties);
    }

    private volatile RelianceStockPickerConfiguration relianceStockPickerConfiguration;
}
