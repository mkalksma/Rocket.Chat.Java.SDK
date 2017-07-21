package io.rocketchat.core.callback.adapter;

import io.rocketchat.common.data.model.ErrorObject;
import io.rocketchat.common.data.model.UserObject;
import io.rocketchat.core.callback.*;
import io.rocketchat.core.model.RocketChatMessage;
import io.rocketchat.core.model.RoomObject;
import io.rocketchat.core.model.SubscriptionObject;
import io.rocketchat.core.model.TokenObject;

import java.util.ArrayList;

/**
 * Created by sachin on 21/7/17.
 */
public class CoreAdapter implements HistoryListener, LoginListener, RoomListener.GetRoomListener, SubscriptionListener.GetSubscriptionListener,UserListener.getUserRoleListener{
    @Override
    public void onLoadHistory(ArrayList<RocketChatMessage> list, int unreadNotLoaded, ErrorObject error) {

    }

    @Override
    public void onLogin(TokenObject token, ErrorObject error) {

    }

    @Override
    public void onGetRooms(ArrayList<RoomObject> rooms, ErrorObject error) {

    }

    @Override
    public void onGetSubscriptions(ArrayList<SubscriptionObject> subscriptions, ErrorObject error) {

    }

    @Override
    public void onUserRoles(ArrayList<UserObject> users, ErrorObject error) {

    }
}
