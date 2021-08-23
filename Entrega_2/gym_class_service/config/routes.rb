Rails.application.routes.draw do
  get '/users/:user_id/participations/', to: 'participations#participations_by_user'
  resources :participations
  resources :events do
    member do
      post :rate
    end
  end
  resources :gym_classes
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
end
