<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Login">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="375dp"
        android:layout_height="191dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.444"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"


        app:layout_constraintVertical_bias="0.229"
        tools:srcCompat="@tools:sample/avatars" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="283dp"
        android:layout_height="47dp"
        android:fontFamily="@font/playfair_display_bold"
        android:text="News Digest"
        android:textSize="34sp"
        app:layout_constraintBottom_toTopOf="@+id/imageView"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.257"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.666" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="94dp"
        android:layout_height="48dp"
        android:layout_marginTop="24dp"
        android:fontFamily="@font/news_cycle_bold"
        android:text="Log in"
        android:textColor="#0B0A0A"
        android:textSize="31sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.104"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView" />

    <EditText
        android:id="@+id/userEmail"
        style="@android:style/Widget.DeviceDefault.EditText"
        android:layout_width="350dp"
        android:layout_height="49dp"
        android:background="@drawable/shape"
        android:ems="10"
        android:inputType="textEmailAddress"
        android:hint=" email@domain.com"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.54"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView2"
        app:layout_constraintVertical_bias="0.068" />

    <EditText
        android:id="@+id/userPassword"
        style="@android:style/Widget.DeviceDefault.EditText"
        android:layout_width="350dp"
        android:layout_height="49dp"
        android:background="@drawable/shape"
        android:ems="10"
        android:inputType="text"
        android:hint=" Enter your password"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.54"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/userEmail"
        app:layout_constraintVertical_bias="0.094" />

    <androidx.appcompat.widget.AppCompatButton

        android:id="@+id/loginbtn"
        android:layout_width="348dp"
        android:layout_height="51dp"
        android:layout_marginTop="32dp"
        android:background="#000000"
        android:text="Log in"
        android:textColor="#FBFAFA"
        app:cornerRadius="0dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.523"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/userPassword" />

    <View
        android:id="@+id/line"
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:layout_marginTop="36dp"
        android:background="@android:color/darker_gray"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"

        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/loginbtn" />

    <androidx.appcompat.widget.AppCompatButton
        android:id="@+id/signupbtn"
        android:layout_width="348dp"
        android:layout_height="51dp"
        android:layout_marginTop="32dp"
        android:background="#000000"
        android:text="Sign Up"
        android:textColor="#FDFCFC"
        app:cornerRadius="0dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.523"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/line" />


</androidx.constraintlayout.widget.ConstraintLayout>
