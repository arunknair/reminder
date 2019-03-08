import {AuthServiceConfig, GoogleLoginProvider} from 'angular5-social-login';

export function getAuthServiceConfigs() {
  const config = new AuthServiceConfig([
    {
      id: GoogleLoginProvider.PROVIDER_ID,
      provider: new GoogleLoginProvider('449004257000-bt6d4brebbq43pvcjud03foraelotjhf.apps.googleusercontent.com')
    }
  ]);
  return config;
}
