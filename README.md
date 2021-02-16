# sdk-JitPack-exmaple
Example on how to introduce the one line integration with our SDK.

## What is the benefits
* just copy and past one line
* looks more professional
* easy to update our SDK versions, user will just change the version in the gradle file. instead of merging himself changes in dependencies.
* gradle will set the best dependencies versions, if the user depend on lower version, and we depend on higher version, it will pick the best (highest) and warn user if it can't be resolved.

## steps
1. sign in into [JitPack](https://jitpack.io/) with user account that have the repo
2. make a release in the repo
3. press "Get It" beside the release version inside jitpack. this will sync the repo inside jitpack

## Ref
[How to create and publish an Android Library](https://sgkantamani.medium.com/how-to-create-and-publish-an-android-library-f37bf715932)
