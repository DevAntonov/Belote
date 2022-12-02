package com.belote.api.dto;

import com.belote.server.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
}
