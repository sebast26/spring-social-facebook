package org.springframework.social.facebook.api.ads;

import org.springframework.social.facebook.api.InvalidParameterException;

/**
 * Exception is thrown when a new ad campaign is created with status other that ACTIVE or PAUSED.
 *
 * @author Sebastian G�recki
 */
public class InvalidCampaignStatusException extends InvalidParameterException {
	public InvalidCampaignStatusException(String providerId, String message) {
		super(providerId, message);
	}
}
