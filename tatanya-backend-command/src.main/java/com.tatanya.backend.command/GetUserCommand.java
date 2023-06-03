package com.tatanya.backend.command;

import com.tatanya.backend.command.base.Command;
import com.tatanya.backend.command.model.GetUserCommandRequest;
import com.tatanya.backend.web.model.response.GetUserWebResponse;

public interface GetUserCommand extends Command<GetUserCommandRequest, GetUserWebResponse> {
}
