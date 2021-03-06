package org.springframework.social.facebook.api.ads.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.facebook.api.impl.json.FacebookObjectMixin;

/**
 * Annotated mixin to add Jackson annotations to AdInsightAction.
 *
 * @author Sebastian G�recki
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AdInsightActionMixin extends FacebookObjectMixin {
	@JsonProperty("action_type")
	String actionType;

	@JsonProperty("value")
	double value;
}
