class Participation < ApplicationRecord
  belongs_to :event

  # Validations
  validates :event_id, presence: true
  validates :user_id, presence: true
end
