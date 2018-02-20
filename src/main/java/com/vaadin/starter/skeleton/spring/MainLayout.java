package com.vaadin.starter.skeleton.spring;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PageConfigurator;
import com.vaadin.flow.shared.communication.PushMode;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@SuppressWarnings("serial")
@Viewport("width=device-width")
@Theme(Lumo.class)
public class MainLayout extends Div implements RouterLayout, PageConfigurator {

	@Override
	public void configurePage(InitialPageSettings settings) {
		
		settings.getUi().getPushConfiguration().setPushMode(PushMode.AUTOMATIC);
	}
}
