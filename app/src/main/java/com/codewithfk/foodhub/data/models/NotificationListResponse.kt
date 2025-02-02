package com.codewithfk.foodhub.data.models

data class NotificationListResponse(
    val notifications: List<Notification>,
    val unreadCount: Int
)