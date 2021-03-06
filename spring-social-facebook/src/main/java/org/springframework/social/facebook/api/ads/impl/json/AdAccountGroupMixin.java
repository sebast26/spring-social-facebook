package org.springframework.social.facebook.api.ads.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.facebook.api.impl.json.FacebookObjectMixin;

/**
 * Annotated mixin to add Jackson annotations to AdAccountGroup.
 *
 * @author Sebastian G�recki
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AdAccountGroupMixin extends FacebookObjectMixin {

	@JsonProperty("account_group_id")
	String id;

	@JsonProperty("name")
	String name;

	@JsonProperty("status")
	int status;
}
